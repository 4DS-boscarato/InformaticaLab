package Ereditarieta.op2.op;

public class SculturaDeperibile extends Scultura {
    private String materiale;
    private float deperibilita;
    private int anni;

    public SculturaDeperibile(String tit, String art, double alt, double larg, double prof, Supporto s, String mat, float dep, int a) throws Exception {
        super(tit, art, alt, larg, prof, s);

        materiale = mat;
        deperibilita = dep;
        anni = a;
    }

    public double printIngombro(){
        float d = 1 - (deperibilita /365 * anni);
        return super.printIngombro()* d;
    }

    public String toString(){
        return super.toString() + " Materiale: " +  materiale + " Deperibilità: " + deperibilita + " Anni di vita: " + anni;
    }
}
