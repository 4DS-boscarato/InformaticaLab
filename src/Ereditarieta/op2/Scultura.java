package Ereditarieta.op2;

public class Scultura extends OperaDarte {
    private double altezza;
    private double larghezza;
    private double profondita;
    private Supporto supp;

    public Scultura(String tit, String art, double alt, double larg, double prof, Supporto s) throws Exception {
        super(tit, art);
        Supporto supp = new Supporto(s.getAltezza(), s.getLarghezza(), s.getProfondita());

        altezza = alt;
        larghezza = larg;
        profondita = prof;
    }

    public double printIngombro(){
        return supp.printIngombroSupporto();
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
