package Ereditarieta.op2;

public class Quadro extends OperaDarte {

    private double altezza;
    private double larghezza;
    private Cornice corn;

    public Quadro(String tit, String art, double alt, double larg, Cornice c) throws Exception {
        super(tit, art);
        Cornice corn = new Cornice(c.getAltezza(), c.getLarghezza(), c.getSpessore());

        altezza = alt;
        larghezza = larg;
    }

    public double printIngombro(){
        return corn.printIngombroCornice();
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
