package interfacce.scontrini;

class Elettronico implements Pagamento {
    private String metodo;

    private double importoPagato;
    private double resto;

    public Elettronico(double importoPagato) {
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
