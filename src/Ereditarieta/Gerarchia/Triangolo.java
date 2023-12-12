package Ereditarieta.Gerarchia;

import java.math.*;

public class Triangolo {
    private double lato;

    public Triangolo(){

    }

    public Triangolo(double lato){
        this.lato=lato;
    }

    public double calcolaPerimetro(){
        return lato*3;
    }

    public double calcolaArea(){
        return (Math.pow(lato, 2)* Math.sqrt(3))/4;
    }



}
