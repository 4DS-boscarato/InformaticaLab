package Ereditarieta.OP;

public class Quadro extends OperaDarte {

    private float altezza;
    private float larghezza;

    public Quadro(String tit, String art, float alt, float larg) throws Exception {
        super(tit, art);
        altezza = alt;
        larghezza = larg;
    }

    public float printIngombro(){
        return altezza * larghezza;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getLarghezza() {
        return larghezza;
    }

    public String toString(){
        return super.toString() + " Altezza Quadro: " +  altezza + " Larghezza Quadro: " + larghezza;
    }
}
