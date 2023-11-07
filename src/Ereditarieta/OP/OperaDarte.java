package Ereditarieta.OP;

public abstract class OperaDarte {

    protected String titolo;
    protected String artista;

    public OperaDarte(String tit, String art) throws Exception {
        setTitolo(tit);
        setArtista(art);
    }

    public abstract float printIngombro();


    public String getTitolo() {
        return titolo;
    }

    public String getArtista() {
        return artista;
    }


    public void setTitolo(String titolo) throws Exception {
        if(titolo == null){
            throw new Exception(" Nella stringa passa si trova null!");
        }
        if(titolo.equals("")){
            throw new Exception(" Nella stringa passata non c'è nulla!");
        }
        this.titolo = titolo;
    }

    public void setArtista(String artista) throws Exception {
        if(artista == null){
            throw new Exception(" Nella stringa passa si trova null!");
        }
        if(artista.equals("")){
            throw new Exception(" Nella stringa passata non c'è nulla!");
        }
        this.artista = artista;
    }

    public String toString(){
        return "Titolo opera: " + titolo + " Nome Artista: " + artista;
    }
}
