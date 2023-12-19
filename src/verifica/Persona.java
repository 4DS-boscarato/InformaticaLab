package verifica;


public class Persona {
    private String cognome;
    private String nome;
    private Data dataDiNascita;
    protected int numeroDiIstanze;


    public Persona(){
        numeroDiIstanze++;
    }
    public Persona(String newC, String newN, Data newDN) throws Exception {
        cognome = newC;
        nome = newN;
        setDataDiNascita(newDN);
        numeroDiIstanze++;
    }


    public Boolean verificaOmonimia(Persona persona) throws Exception {
        if(persona == null){
            throw new Exception("Parametro a null!");
        }
        if(cognome.equals(persona.getCognome()) && nome.equals(persona.getNome())){
            return true;
        }
        return false;
    }

    public Integer calcolaEta() throws Exception {
        Data dataOggi = new Data();
        return Data.differenzaInAnni(dataDiNascita, dataOggi);
    }

    public String info() throws Exception{
        if(cognome == null || nome == null || dataDiNascita == null){
            throw new Exception("Uno o più parametri sono null!");
        }
        return "Cognome: " + cognome + "\nNome: " + nome + "\nData di Nascita: " + dataDiNascita.getData();
    }


    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataDiNascita() {
        return dataDiNascita;
    }
    public void setDataDiNascita(Data dataDiNascita) throws Exception {
        this.dataDiNascita = new Data(dataDiNascita.getGiorno(), dataDiNascita.getMese(), dataDiNascita.getAnno());
    }

    public int getNumeroDiIstanze() {
        return numeroDiIstanze;
    }
}