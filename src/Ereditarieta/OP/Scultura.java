package Ereditarieta.OP;

public class Scultura extends OperaDarte {
    private float altezza;
    private float larghezza;
    private float profondita;

    public Scultura(String tit, String art, float alt, float larg, float prof) throws Exception {
        super(tit, art);
        altezza = alt;
        larghezza = larg;
        profondita = prof;
    }

    public float printIngombro(){
        return altezza * larghezza * profondita;
    }

    public float getAltezza() {
        return altezza;
    }

    public float getProfondita() {
        return profondita;
    }

    public float getLarghezza() {
        return larghezza;
    }

    public String toString(){
        return super.toString() + " Altezza Scultura: " +  altezza + " Larghezza Scultura: " + larghezza + " Profondita Scultura: " + profondita
    }
}
