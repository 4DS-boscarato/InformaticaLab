package Ereditarieta.poligoni;


import java.lang.Math;

public class Quadrato extends Poligono {

    public Quadrato(float newLungLato) throws Exception {
        super(newLungLato, 4);
    }

    public StringBuilder disegno(char carattere) {
        StringBuilder disegno = new StringBuilder();

        for (int i = 0; i < getLungLato(); i++) {
            if(i == 0 || i == getLungLato() - 1){
                for(int j = 0; j < getLungLato(); j++) {
                    disegno.append(carattere).append(" ");
                }
            }
            else{
                for(int j = 0; j < getLungLato(); j++) {
                    if(j == 0 || j == getLungLato() - 1){
                        disegno.append(carattere).append(" ");
                    }
                    else{
                        disegno.append("  ");
                    }
                }
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

    public String toString() {
        return "Quadrato " + super.toString();
    }
}
