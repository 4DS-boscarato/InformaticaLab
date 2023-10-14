package poligoni;

import java.lang.Math;

class Pentagono extends Poligono{
    private float l5;

    public Pentagono(float newL1, float newL2, float newL3, float newL4, float newL5){
        super(newL1, newL2, newL3, newL4);
        l5 = newL5;
    }

    public float calcolaPerimetro(){
        return super.calcolaPerimetro() + l5;
    }

    public double apotema(){
        return 0.68819/l5;
    }

    public double area(){
        return Math.pow(l5, 2) * 1.72;
    }

    public float getL5() {
        return l5;
    }

    public void setL5(float newL5) {
        l5 = newL5;
    }
}
