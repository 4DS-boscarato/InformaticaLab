package poligoni;

class Rombo extends Poligono{

    private float base;
    private float altezza;

    public Rombo(float newL1, float newL2, float newL3, float newL4, float newB, float newA){
        super(newL1, newL2, newL3, newL4);
        base = newB;
        altezza = newA;
    }

    public double apotema(){
        return area() * 2 / super.calcolaPerimetro();
    }

    public double area(){
        return base * altezza;
    }

    public float getBase(){
        return base;
    }

    public float getAltezza(){
        return altezza;
    }

    public void setBase(float newB){
        base = newB;
    }

    public void setAltezza(float newA){
        altezza = newA;
    }
}
