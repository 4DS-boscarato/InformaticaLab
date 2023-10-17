package Ereditarieta.poligoni;


public class Poligono {
    private float lungLato;
    private int nLati;

    public Poligono(float newLungLato, int newNLati) {
        lungLato = newLungLato;
        nLati = newNLati;
    }

    public float calcolaPerimetro() {
        return lungLato * nLati;
    }

    public float getLungLato() {
        return lungLato;
    }

    public float getNLati() {
        return nLati;
    }

    public void setLungLato(float newLungLato) {
        lungLato = newLungLato;
    }

    public void setnLati(int newNLati) {
        nLati = newNLati;
    }

    public String toString(){
        return "Lunghezza Lato: " + lungLato + " Numero Lati: " + nLati;
    }
}





