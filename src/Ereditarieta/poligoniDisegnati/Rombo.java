package Ereditarieta.poligoniDisegnati;

public class Rombo extends Poligono{
    private float dMagg;
    private float dMinn;


    public Rombo(float newLungLato, float newB, float newA){
        super(newLungLato, 4);
        dMagg = newB;
        dMinn = newA;
    }


    public double apotema(){
        return area() * 2 / super.calcolaPerimetro();
    }

    public float area(){
        return dMagg * dMinn;
    }


    public float getdMagg(){
        return dMagg;
    }

    public float getdMinn(){
        return dMinn;
    }

    public StringBuilder disegno(char carattere) {
        StringBuilder disegno = new StringBuilder();

        for (int i = 0; i < getLungLato(); i++) {
            for (int j = 0; j < getLungLato() - i - 1; j++) {
                disegno.append("  "); // Aggiunge spazi per centrare il rombo
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                disegno.append(carattere).append(" ");
            }
            disegno.append("\n");
        }

        for (int i = (int) (getLungLato() - 2); i >= 0; i--) {
            for (int j = 0; j < getLungLato() - i - 1; j++) {
                disegno.append("  "); // Aggiunge spazi per centrare il rombo
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                disegno.append(carattere).append(" ");
            }
            disegno.append("\n");
        }

        return disegno;
    }


    public String toString(){
        return super.toString() + " Diagonale Maggiore: " + dMagg + " Dagonale Minima: " + dMinn;
    }
}
