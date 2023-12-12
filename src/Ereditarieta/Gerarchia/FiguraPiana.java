package Ereditarieta.Gerarchia;

public abstract class FiguraPiana extends FiguraGeometrica{

    public FiguraPiana(String c) throws Exception{
        super(c);
    }

    public void setColore(String c){
        super.setColore(c);
    }

    public String getColore() {
        return super.getColore();
    }

    public abstract double calcolaPerimetro();

    public abstract double calcolaArea();

    public String toString() {
        return super.toString();
    }
}
