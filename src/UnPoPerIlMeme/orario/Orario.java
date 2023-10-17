package UnPoPerIlMeme.orario;


public class Orario {

    private int ora;
    private int min;
    private int sec;

    public Orario(int ora, int minuti, int secondi) throws Exception{
        if(ora >= 0 && ora < 24 && minuti >= 0 && minuti < 60 && secondi >= 0 && secondi < 60){
            this.ora = ora;
            min = minuti;
            sec = secondi;
        }
        else{
            throw new Exception(" Inserire valori normali!");
        }
    }

    public void setOra(int ora) throws Exception {
        if(ora >= 0 && ora < 24){
            this.ora = ora;
        }
        else{
            throw new Exception(" Inserire un valore normale!");
        }

    }

    public void setMinuti(int minuti) throws Exception {
        if(minuti >= 0 && minuti < 60){
            this.min = minuti;
        }
        else{
            throw new Exception(" Inserire un valore normale!");
        }
    }

    public void setSecondi(int secondi) throws Exception {
        if(secondi >= 0 && secondi < 60){
            this.sec = secondi;
        }
        else{
            throw new Exception(" Inserire un valore normale!");
        }
    }

    public int secFromMidNight(){
        int s;
        s = min*60+ora*60*60+sec;
        return s;
    }

    public int minFromMidNight(){
        int m;
        m = min+ora*60+sec/60;
        return m;
    }

    public int oraFromMidNight(){
        return ora;
    }

    public String toString(){
        return "L'Orario attuale è: " + ora + " : " + min + " : " + sec;
    }
}
