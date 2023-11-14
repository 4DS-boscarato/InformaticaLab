package Ereditarieta.op2;

public class Cornice {
    private double altezza;
    private double larghezza;
    private double spessore;

    public Cornice(double alt, double larg, double spes){
        altezza = alt;
        larghezza = larg;
        spessore = spes;
    }

    public double printIngombroCornice(){
        return altezza * larghezza * spessore;
    }


    public double getAltezza() {
        return altezza;
    }
    public double getLarghezza() {
        return larghezza;
    }
    public double getSpessore() {
        return spessore;
    }
}
