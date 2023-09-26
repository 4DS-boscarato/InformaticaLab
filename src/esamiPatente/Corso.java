package esamiPatente;

public class Corso{
    private Studente stud[];
    private Data dataEsame[];
    private int nProva;     //dimLog
    private String tipoPatente;
    private boolean esito;

    public Corso(int lung){
        stud = new Studente[lung];
        dataEsame = new Data[lung];
        nProva = 0;
        tipoPatente = "";
    }

    public void inserGeneral(Data d1, Studente sT1, String gradoPatente, boolean esito) throws Exception {
        inserData(d1);
        inserStudente(sT1);
        tipoPatente = gradoPatente;
        this.esito = esito;
        nProva++;
    }

    private void inserData(Data d1) throws Exception {
        dataEsame[nProva] = new Data(d1.getGiorno(), d1.getMese(), d1.getAnno());
    }

    public void inserStudente(Studente sT1){
        stud[nProva] = new Studente(sT1.getNome(), sT1.getCognome(), sT1.getMail(), sT1.getTelefono());
    }

    public int getNProva(){
        return nProva;
    }

    public String getTipologiaPatente(){
        return tipoPatente;
    }

    public boolean getEsito(){
        return esito;
    }

    public void setTipologiaPatente(String pate){
        tipoPatente = pate;
    }

    public void setEsito(boolean esito){
        this.esito = esito;
    }
}
