package Ereditarieta.poligoni;


import java.lang.Math;

public class Quadrato extends Poligono{

    public Quadrato(float newLungLato){
        super(newLungLato, 4);
    }

    public double apotema(){
        return getLungLato()/2;
    }

    public double diagonale(){
        return Math.sqrt(Math.pow(getLungLato(), 2) + Math.pow(getLungLato(), 2));
    }

    public double area(){
        return getLungLato() * getLungLato();
    }
}
