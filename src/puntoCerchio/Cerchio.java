package puntoCerchio;

public class Cerchio{
    private Centro c1;
    private float raggio;

    public Cerchio(Centro pt1, float newRaggio) throws Exception {
        if(newRaggio <= 0){
            throw new Exception(" Il raggio deve essere maggiore di 0!");
        }
        c1 = new Centro(pt1.getX(), pt1.getY());
        raggio = newRaggio;
    }

    public void setC1(Centro pt1){
        c1.setX(pt1.getX());
        c1.setY(pt1.getY());
    }

    public void raggio(float newRaggio){
        raggio = newRaggio;
    }

    public Centro getC1(){
        Centro c2;
        return c2 = new Centro(c1.getX(), c1.getY());
    }

    public float getRaggio(){
        return raggio;
    }

    public float circonferenza(){
        return (float) (2 * 3.14 * raggio);
    }

    public float area(){
        return (float)((raggio*raggio) * 3.14);
    }

    public void scala(float percentuale){
        raggio += (raggio/100) * percentuale;
    }

    public void traslaSegmento(float tX, float tY){
        c1.traslaCentro(tX, tY);
    }
}