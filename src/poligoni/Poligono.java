package poligoni;
class Poligono{
    private float l1;
    private float l2;
    private float l3;
    private float l4;

    public Poligono(float newL1, float newL2, float newL3, float newL4){
        l1 = newL1;
        l2 = newL2;
        l3 = newL3;
        l4 = newL4;
    }

    public float calcolaPerimetro(){
        return l1 + l2 + l3 + l4;
    }

    public void setL1(float newL1){
        l1 = newL1;;
    }

    public void setL2(float newL2){
        l2 = newL2;
    }

    public void setL3(float newL3){
        l3 = newL3;
    }

    public void setL4(float newL4){
        l4 = newL4;
    }

    public float getL1(){
        return l1;
    }

    public float getL2(){
        return l2;
    }

    public float getL3(){
        return l3;
    }

    public float getL4(){
        return l4;
    }
}





