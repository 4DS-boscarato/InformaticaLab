package Ereditarieta.Gerarchia;

public class FiguraGeometrica {
    private String colore;

    public FiguraGeometrica(String c) throws Exception{
        if(c == null){
            throw new Exception("Stringa nulla!");
        }
        colore = c;
    }

    public void setColore(String c) {
        colore = c;
    }

    public String getColore(){
        return colore;
    }

    public String toString(){
        return "Colore: " + colore;
    }
}
