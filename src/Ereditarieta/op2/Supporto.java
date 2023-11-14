package Ereditarieta.op2;

public class Supporto {
    private double altezza;
    private double larghezza;
    private double profondita;

    public Supporto(double alt, double larg, double prof) {
        altezza = alt;
        larghezza = larg;
        profondita = prof;
    }

    public double printIngombroSupporto(){
        return altezza * larghezza * profondita;
    }


    public double getAltezza() {
        return altezza;
    }
    public double getLarghezza() {
        return larghezza;
    }
    public double getProfondita() {
        return profondita;
    }
}
