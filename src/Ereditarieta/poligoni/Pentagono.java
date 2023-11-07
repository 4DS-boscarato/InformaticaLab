package Ereditarieta.poligoni;


import java.lang.Math;

public class Pentagono extends Poligono{

    public Pentagono(float newLungLato) throws Exception {
        super(newLungLato, 5);
    }

    public float calcolaPerimetro(){
        return super.calcolaPerimetro();
    }

    public double apotema(){
        return 0.68819/getLungLato();
    }

    public float area(){
        return (float) (Math.pow(getLungLato(), 2) * 1.72);
    }

    public StringBuilder disegno(char carattere) {
        return null;
    }

    public String toString() {
        return "Pentagono " + super.toString();
    }
}
