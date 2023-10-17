package Ereditarieta.poligoni;


public class Esagono extends Poligono{


    public Esagono(float newLungLato){
        super(newLungLato, 6);
    }

    public float calcolaPerimetro(){
        return super.calcolaPerimetro();
    }

    public double apotema(){
        return 0.86602/getLungLato();
    }

    public double area(){
        return calcolaPerimetro() * apotema()/2;
    }
}
