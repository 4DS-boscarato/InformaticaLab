package Ereditarieta.poligoni;


import java.lang.Math;

public class Pentagono extends Poligono{

    public Pentagono(float newLungLato){
        super(newLungLato, 5);
    }

    public float calcolaPerimetro(){
        return super.calcolaPerimetro();
    }

    public double apotema(){
        return 0.68819/getLungLato();
    }

    public double area(){
        return Math.pow(getLungLato(), 2) * 1.72;
    }
}
