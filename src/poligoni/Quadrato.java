package poligoni;
class Quadrato extends Poligono{

    public Quadrato(float newL1, float newL2, float newL3, float newL4){
        super(newL1, newL2, newL3, newL4);
    }

    public double apotema(){
        return getL4()/2;
    }

    public double area(){
        return getL1() * getL2();
    }
}
