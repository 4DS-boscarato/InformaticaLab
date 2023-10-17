package UnPoPerIlMeme.melinda;

public class Raccolta{
    private double quintali;
    private Data giornata;

    public Raccolta(Data dateRaccolta, double quintali) throws Exception {
        if(quintali < 0){
            throw new Exception("I quitali non possono essere negativi");
        }
        giornata = dateRaccolta;
        this.quintali = quintali;
    }

    public double getQuintali() {
        return quintali;
    }

    public Data getData() {
        return giornata;
    }
}

