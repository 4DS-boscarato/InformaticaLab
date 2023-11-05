package Ereditarieta.poligoniDisegnati;

public class Poligono {
    private float lungLato;
    private int nLati;


    public Poligono(float newLungLato, int newNLati) {
        lungLato = newLungLato;
        nLati = newNLati;
    }


    public float calcolaPerimetro(){
        return 0;
    }
    public float area(){
        return 0;
    }
    public StringBuilder disegno(char carattere){
        return new StringBuilder();
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
