package Ereditarieta.Gerarchia;


public class Quadrato implements PoligonoRegolare{
    private float lato;

    public Quadrato(float newLato){
        lato = newLato;
    }

    public float calcolaPerimetro(){
        return lato * 4;
    }

    public float calcolaArea(){
        return lato * lato;
    }

    public float calcolaDiagonale(){
        return (float) (lato * Math.sqrt(2));
    }

    public float calcolaApotema() {
        return 0;
    }

    public float getLato() {
        return lato;
    }

    public void setLato(float lato) {
        this.lato = lato;
    }
}
