package iTTBuonarroti;

public class Studente{
    private String nome;
    private String cognome;

    public Studente(String n, String c){
        nome = n;
        cognome = c;
    }

    public Studente(Studente stud){
        nome = stud.nome;
        cognome = stud.cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String toString() {
        return "Studente{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + '}';
    }
}
