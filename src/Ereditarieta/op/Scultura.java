package Ereditarieta.op;

public class Scultura extends OperaDarte {
    private double altezza;
    private double larghezza;
    private double profondita;

    public Scultura(String tit, String art, double alt, double larg, double prof) throws Exception {
        super(tit, art);
        altezza = alt;
        larghezza = larg;
        profondita = prof;
    }

    public double printIngombro(){
        return altezza * larghezza * profondita;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getProfondita() {
        return profondita;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public String toString(){
        return super.toString() + " Altezza Scultura: " +  altezza + " Larghezza Scultura: " + larghezza + " Profondita Scultura: " + profondita;
    }
}
