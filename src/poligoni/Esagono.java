package poligoni;

class Esagono extends Pentagono{
    private float l6;

    public Esagono(float newL1, float newL2, float newL3, float newL4, float newL5,float newL6){
        super(newL1, newL2, newL3, newL4, newL5);
        l6 = newL6;
    }

    public float calcolaPerimetro(){
        return super.calcolaPerimetro() + l6;
    }

    public double apotema(){
        return 0.86602/l6;
    }

    public double area(){
        return calcolaPerimetro() * apotema()/2;
    }

    public float getL6() {
        return l6;
    }

    public void setL6(float newL6) {
        l6 = newL6;
    }
}
