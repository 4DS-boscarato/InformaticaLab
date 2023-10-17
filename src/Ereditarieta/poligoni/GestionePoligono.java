package Ereditarieta.poligoni;


import java.util.Arrays;

public class GestionePoligono{
    private Poligono[] poligoni;
    private int nPoligoni;

    public GestionePoligono(int lung) throws Exception {
        if(lung <= 0){
            throw new Exception(" La dimensione deve essere maggiore di 0!");
        }
        poligoni = new Poligono[lung];
        nPoligoni = 0;
    }

    public void inser(Poligono poligono){
        poligoni[nPoligoni] = poligono;
        nPoligoni++;

        if(nPoligoni == poligoni.length){
            poligoni = Arrays.copyOf(poligoni, poligoni.length * 2);
        }
    }

    public float perimetroInI(int i){
        return poligoni[i].calcolaPerimetro();
    }


    public String toString() {
        return "GestionePoligono: " + "\npoligoni = " + Arrays.toString(poligoni) + ", \nnPoligoni =" + nPoligoni;
    }
}