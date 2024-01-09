package interfacce.scontrini;

class Contante implements Pagamento {
    private double importoPagato;
    private double resto;

    public Contante(double importoPagato) {
        this.importoPagato = importoPagato;
    }

    public void effettuaPagamento(double importo) {
        resto = importoPagato - importo;
    }

    public double getImportoPagato() {
        return importoPagato;
    }

    public double getResto() {
        return resto;
    }
}
