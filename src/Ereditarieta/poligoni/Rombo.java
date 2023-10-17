package Ereditarieta.poligoni;


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

    public double area(){
        return dMagg * dMinn;
    }

    public float getdMagg(){
        return dMagg;
    }

    public float getdMinn(){
        return dMinn;
    }

    public String toString(){
        return super.toString() + " Diagonale Maggiore: " + dMagg + " Dagonale Minima: " + dMinn;
    }
}
