package Ereditarieta.op2;

public abstract class OperaDarte {

    protected String titolo;
    protected String artista;

    public OperaDarte(String tit, String art) throws Exception {
        checkString(tit);
        checkString(art);

        titolo = tit;
        artista = art;
    }

    public abstract double printIngombro();

    public static boolean equals(OperaDarte oP){
        OperaDarte[] copiaOpere = Collezione.getOpere();

        for(int i = 0; i < copiaOpere.length ;i++){
            if(copiaOpere[i] == oP){
                return true;
            }
        }
        return false;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getArtista() {
        return artista;
    }

    private void checkString(String str) throws Exception {
        if(str == null){
            throw new Exception(" Nella stringa passa si trova null!");
        }
        if(str.equals("")){
            throw new Exception(" Nella stringa passata non c'è nulla!");
        }
    }

    public String toString(){
        return "Titolo opera: " + titolo + " Nome Artista: " + artista;
    }
}
