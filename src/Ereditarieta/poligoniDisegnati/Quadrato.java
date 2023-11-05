package Ereditarieta.poligoniDisegnati;

public class Quadrato extends Poligono{

    public Quadrato(float newLungLato){
        super(newLungLato, 4);
    }

    public StringBuilder disegno(char carattere) {
        StringBuilder disegno = new StringBuilder();

        for (int i = 0; i < getLungLato(); i++) {
            for (int j = 0; j < getLungLato(); j++) {
                disegno.append(carattere).append(" ");
            }
            disegno.append("\n");
        }

        return disegno;
    }

    public double apotema(){
        return getLungLato()/2;
    }

    public double diagonale(){
        return Math.sqrt(Math.pow(getLungLato(), 2) + Math.pow(getLungLato(), 2));
    }

    public float area(){
        return getLungLato() * getLungLato();
    }

    public float calcolaPerimetro(){
        return getLungLato() * getNLati();
    }
}
