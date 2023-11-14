package Ereditarieta.op;

public class Quadro extends OperaDarte {

    private double altezza;
    private double larghezza;

    public Quadro(String tit, String art, double alt, double larg) throws Exception {
        super(tit, art);
        altezza = alt;
        larghezza = larg;
    }

    public double printIngombro(){
        return altezza * larghezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public double getLarghezza() {
        return larghezza;
    }

    public String toString(){
        return super.toString() + " Altezza Quadro: " +  altezza + " Larghezza Quadro: " + larghezza;
    }
}
