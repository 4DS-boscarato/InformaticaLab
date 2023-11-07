package Ereditarieta.poligoni;


public class Esagono extends Poligono{


    public Esagono(float newLungLato) throws Exception {
        super(newLungLato, 6);
    }

    public float calcolaPerimetro(){
        return super.calcolaPerimetro();
    }

    public double apotema(){
        return 0.86602/getLungLato();
    }

    public float area(){
        return (float) (calcolaPerimetro() * apotema()/2);
    }

    public StringBuilder disegno(char carattere) {
        StringBuilder disegno = new StringBuilder();

        int spaziIniziali = (int) (getLungLato() - 1);
        int spaziInterni = (int) (getLungLato() * 2 - 3);

        // Parte superiore dell'esagono
        for (int i = 0; i < getLungLato(); i++) {
            // Aggiungi spazi iniziali
            for (int j = 0; j < spaziIniziali; j++) {
                disegno.append("  ");
            }

            // Aggiungi carattere e spazi interni
            disegno.append(carattere);
            if (i > 0) {
                for (int j = 0; j < spaziInterni; j++) {
                    disegno.append("  ");
                }
                disegno.append(carattere);
            }

            // Vai alla riga successiva
            disegno.append("\n");
            spaziIniziali--;
            spaziInterni += 2;
        }

        // Parte inferiore dell'esagono
        spaziInterni -= 2;
        spaziIniziali = 1;
        for (int i = (int) (getLungLato() - 2); i >= 0; i--) {
            // Aggiungi spazi iniziali
            for (int j = 0; j < spaziIniziali; j++) {
                disegno.append("  ");
            }

            // Aggiungi carattere e spazi interni
            disegno.append(carattere);
            if (i > 0) {
                for (int j = 0; j < spaziInterni; j++) {
                    disegno.append("  ");
                }
                disegno.append(carattere);
            }

            // Vai alla riga successiva
            disegno.append("\n");
            spaziIniziali++;
            spaziInterni -= 2;
        }

        return disegno;
    }
    public String toString() {
        return "Esagono " + super.toString();
    }
}
