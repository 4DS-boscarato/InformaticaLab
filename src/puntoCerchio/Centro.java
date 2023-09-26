package puntoCerchio;

public class Centro{
    private float x;
    private float y;

    public Centro(float newX,float newY){
        x = newX;
        y = newY;
    }

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void setX(float newX){
        x = newX;
    }

    public void setY(float newY){
        y = newY;
    }

    public void traslaCentro(float tX, float tY){
        x += tX;
        y += tY;
    }

    public int centroQuadrante(){
        if(x > 0) {
            if (y > 0) {
                return 1;
            }
            else {
                return 4;
            }
        }
        else{
            if(y > 0){
                return 2;
            }
            else{
                return 3;
            }
        }
    }
}
