package esamiPatente;

public class AnnoCorrente {
    private Corso esame[];
    private int giornata;

    public AnnoCorrente(int lung) {
        esame = new Corso[lung];
        giornata = 0;
    }

    public void InserimentoNuovoEsame(Data d1, Studente sT1, String gradoPatente, boolean esito) throws Exception {
        esame[giornata].inserGeneral(d1, sT1, gradoPatente, esito);
    }
}
