package interfacce.scontrini;


class Prodotto {
    private String nome;
    private double costo;
    private double iva;

    public Prodotto(String nome, double costo, double iva) {
        this.nome = nome;
        this.costo = costo;
        this.iva = iva;
    }

    public String getNome() {
        return nome;
    }
    public double getCosto() {
        return costo;
    }
    public double getIva() {
        return iva;
    }
}
