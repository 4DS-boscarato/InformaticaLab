package UnPoPerIlMeme.melinda;


public class GestioneRaccolta {
    private Raccolta[] stagione;
    private int dimLog;


    public GestioneRaccolta(int lung) throws Exception{
        if(lung <= 0){
            throw new Exception("Inserisci melgio la lunghezza");
        }
        stagione = new Raccolta[lung];
        dimLog = 0;
    }

    public void nuovaRaccolta(Raccolta r1){
        stagione[dimLog] = r1;
        dimLog++;
        if(dimLog == stagione.length) {
            raddoppiaArray();
        }
    }

    private void raddoppiaArray() {
        stagione = java.util.Arrays.copyOf(stagione, stagione.length * 2);
    }

    public int getDimLog(){
        return dimLog;
    }

    private void arrayVuoto() throws Exception{
        if(dimLog == 0){
            throw new Exception("Non ci sono raccolte registrate! ");
        }
    }


    public Data gMAxRaccolta() throws Exception {
        arrayVuoto();
        double max = stagione[0].getQuintali();
        int indice = 0;

        for (int i = 1; i < dimLog; i++) {
            if (stagione[i].getQuintali() > max) {
                max = stagione[i].getQuintali();
                indice = i;
            }
        }
        return stagione[indice].getData();
    }


    public double racSomma() throws Exception {
        arrayVuoto();
        double somma = 0;
        for (int i = 0; i < dimLog; i++) {
            somma += stagione[i].getQuintali();
        }

        return somma;
    }


    public double racMedia() throws Exception {
        return racSomma() / dimLog;
    }


    public int gSopraSoglia (Data[]d1,double soglia) throws Exception {
        arrayVuoto();
        if(soglia < 0){
            throw new Exception("Inserisci melgio la soglia");
        }
        int j = 0;
        for (int i = 0; i < dimLog; i++) {
            if (stagione[i].getQuintali() >= soglia) {
                d1[j] = stagione[i].getData();
                j++;
            }
        }
        return j;
    }


    public double qRaccGiornata(Data g1) throws Exception {
        arrayVuoto();
        boolean checkgiorno = false;
        int indice = 0;
        int i = 0;

        while(i < dimLog && !checkgiorno){
            if(g1 == stagione[i].getData()) {
                indice = i;
                checkgiorno = true;
            }
            i++;
        }
        if(checkgiorno){
            throw new Exception("Il giorno inserito non è presente");
        }

        return stagione[indice].getQuintali();
    }
}
