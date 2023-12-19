package verifica;


import java.util.Arrays;

public class Studente extends Persona {
    private final String SCUOLA = "ITT Buonarroti";
    private Integer classe;
    private Boolean isRipetente;
    private Float[] voti;

    public Studente(){
        numeroDiIstanze++;
    }
    public Studente(Integer newCl, Boolean newIsRip, String newCo, String newNo, Data newDN) throws Exception {
        super(newCo, newNo, newDN);
        setClasse(newCl);
        setRipetente(newIsRip);

    }


    public Boolean verificaOmonimia(Studente studente) throws Exception {
        if(studente ==
                null){
            throw new Exception("Parametro a null!");
        }
        if(classe == studente.getClasse()){
            if(getCognome().equals(studente.getCognome()) && getNome().equals(studente.getNome())){
                return true;
            }
        }
        return false;
    }

    public void aggiungiVoto(Float voto) throws Exception {
        if(3 <= voto && voto >= 10){
            throw new Exception("Uno o più voti non seguivano i requisiti!");
        }

        int nuovaLung = voti.length + 1;
        Float[] tmp = new Float[nuovaLung];

        System.arraycopy(voti, 0, tmp, 0, voti.length);
        tmp[nuovaLung - 1] = voto;

        voti = tmp;
    }

    public void rimuoviVoto(Integer posizione) throws Exception {
        if(posizione >= voti.length){
            throw new Exception("La posizione non è presente nell'Array di voti!");
        }
        int nuovaLung = voti.length - 1;
        Float[] tmp = new Float[nuovaLung];

        for(int i = posizione; i < voti.length - 1; i++){
            voti[i] = voti[i + 1];
        }

        System.arraycopy(voti, 0, tmp, 0, nuovaLung);
        voti = tmp;
    }

    public Boolean promuovi() throws Exception{
        if(classe < 5){
            classe++;
            return true;
        }
        else{
            throw new Exception("Non puoi promuovere uno studente più di cosi!");
        }
    }

    public Boolean promuovi(Integer numeroClassi) throws Exception{
        if(numeroClassi == null){
            throw new Exception("Parametro a null!");
        }
        Integer tmp = classe;
        classe += numeroClassi;

        if(classe <= 5) {
            return true;
        }
        else{
            classe = tmp;
            throw new Exception("Non puoi promuovere uno studente più di cosi!");
        }
    }

    public String info() throws Exception {
        for(int i = 0; i < voti.length; i++){
            if(voti[i] == null){
                throw new Exception("Voto dello Studente settato a null!");
            }
        }
        if (classe == null || isRipetente == null || getCognome() == null || getNome() == null || getDataDiNascita() == null) {
            throw new Exception("Uno o più parametri sono null!");
        }
        String str = "";
        str = "Scuola: " + SCUOLA +
                "\nClasse: " + classe +
                "\nCognome: " + getCognome() +
                "\nNome: " + getNome() +
                "\nData di Nascita: " + getDataDiNascita().getData() +
                "\nRipetente: " + isRipetente;

        if(voti.length == 0){
            return str += "\nVoti: " + "Nessuno voto presente!";

        }
        else{
            return str += "\nVoti: " + Arrays.toString(voti);
        }
    }



    public Integer getClasse() {
        return classe;
    }
    public void setClasse(Integer classe) throws Exception {
        if(classe == null){
            throw new Exception("Parametro a null!");
        }
        if(!(1 <= classe && classe <= 5)){
            throw new Exception("Classe fuori dal range 1 - 5!");
        }
        this.classe = classe;
    }

    public Boolean getRipetente() {
        return isRipetente;
    }
    public void setRipetente(Boolean ripetente) throws Exception {
        if(ripetente == null){
            throw new Exception("Parametro a null!");
        }
        isRipetente = ripetente;
    }

    public Float[] getVoti() {
        return voti;
    }
    public void setVoti(Float[] newVoti) throws Exception{
        for(int i = 0; i < newVoti.length; i++){
            if(voti[i] == null){
                throw new Exception("un voto passato è settato a null!");
            }
            if((3 <= newVoti[i] && newVoti[i] >= 10) && voti[i] % 0.25 == 0){
                throw new Exception("Uno o più voti non seguivano i requisiti!");
            }
        }
        this.voti = newVoti.clone();
    }
}
