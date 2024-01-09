package interfacce.scontrini;

import java.util.ArrayList;


class Scontrino {
    private Supermercato supermercato;
    private ArrayList<Prodotto> prodotti;
    private Pagamento pagamento;
    private double totale;

    public Scontrino(Supermercato supermercato) {
        this.supermercato = supermercato;
        this.prodotti = new ArrayList<>();
        this.totale = 0.0;
    }

    public void aggiungiProdotto(Prodotto prodotto) throws Exception {
        int i = 0;
        boolean found = false;
        while(i <= supermercato.listaProdotti.length){
            if(prodotto == supermercato.listaProdotti[i]){
                found = true;
            }
            i++;
        }
        if(found){
            prodotti.add(prodotto);
            totale += prodotto.getCosto() * (1 + prodotto.getIva());
        }
        else{
            throw new Exception("Prodotto non presente all'interno della dispensa!");
        }
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String completaPagamento() throws Exception{
        String returnatore = "";
        if(pagamento != null) {
            pagamento.effettuaPagamento(totale);
            returnatore += "Metodo di pagamento: " + pagamento.getClass().getSimpleName();
            returnatore += "/nImporto pagato: " + pagamento.getImportoPagato() + " EUR";

            if (pagamento instanceof Contante) {
                returnatore += "/nResto: " + ((Contante) pagamento).getResto() + " EUR";
            }
            else{
                returnatore += "/nResto: 00.00";
            }
        } else {
            throw new Exception("Pagamento non effettuato!");
        }
        return returnatore;
    }

    public void stampaScontrino() throws Exception {
        /*
        System.out.println("Supermercato: " + supermercato.getNome());
        System.out.println("Indirizzo: " + supermercato.getIndirizzo());
        System.out.println("Mail: " + supermercato.getMail());
        System.out.println("Telefono: " + supermercato.getTelefono());
        */

        System.out.println("\nDettagli Spesa:");
        for (Prodotto prodotto : prodotti) {
            System.out.printf("%-20s %10.2f EUR\n", prodotto.getNome(), prodotto.getCosto() * (1 + prodotto.getIva()));
        }

        System.out.println("\nTOTALE COMPLESSIVO: " + totale + " EUR");
        System.out.println(completaPagamento());
    }
}
