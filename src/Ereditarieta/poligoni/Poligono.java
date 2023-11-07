package Ereditarieta.poligoni;


public abstract class Poligono {
    private float lungLato;
    private int nLati;

    public Poligono(float newLungLato, int newNLati) throws Exception {
        setLungLato(newLungLato);
        setnLati(newNLati);
    }

    public float calcolaPerimetro() {
        return lungLato * nLati;
    }

    abstract public float area();
    abstract public StringBuilder disegno(char carattere);

    public float getLungLato() {
        return lungLato;
    }

    public float getNLati() {
        return nLati;
    }

    public void setLungLato(float newLungLato) throws Exception {
        if(newLungLato <= 0) {
            throw new Exception(" Lato minore di 0");
        }
        lungLato = newLungLato;
    }

    public void setnLati(int newNLati) throws Exception {
        if(newNLati <= 2){
            throw new Exception(" Lato minore di 0");
        }
        nLati = newNLati;
    }

    public String toString(){
        return "Lunghezza Lato: " + lungLato + "\nNumero Lati: " + nLati;
    }
}





