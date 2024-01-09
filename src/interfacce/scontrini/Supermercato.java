package interfacce.scontrini;

import java.util.Arrays;


class Supermercato {
    private String nome;
    private String indirizzo;
    private String mail;
    private String telefono;
    protected Prodotto[] listaProdotti;

    public Supermercato(String nome, String indirizzo, String mail, String telefono, Prodotto[] listaProdotti) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.mail = mail;
        this.telefono = telefono;
        this.listaProdotti = listaProdotti.clone();
    }


    public void aggiungiProd(Prodotto prodotto) throws Exception {
        if(ricerca(prodotto) == -1){
            throw new Exception("Il prodotto esiste di già!");
        }
        else{
            int newLung = listaProdotti.length+1;
            listaProdotti = java.util.Arrays.copyOf(listaProdotti, newLung);
            listaProdotti[newLung-1] = prodotto;
        }
    }

    public void rimuoviProd(Prodotto prodotto) throws Exception {
        if(!(ricerca(prodotto) == -1)){
            throw new Exception("Il prodotto non esiste!");
        }
        else{
            for(int i )
            int newLung = listaProdotti.length+1;
            listaProdotti = java.util.Arrays.copyOf(listaProdotti, newLung);
            listaProdotti[newLung-1] = prodotto;
        }
    }

    private int ricerca(Prodotto prodotto){
        int i = 0;
        int found = -1;
        while(i <= listaProdotti.length) {
            if (prodotto == listaProdotti[i]) {
                found = i;
            }
            i++;
        }
        return found;
    }


    public String getNome() {
        return nome;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    public String getMail() {
        return mail;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getListaProdotti() {
        return Arrays.toString(listaProdotti);
    }
}
