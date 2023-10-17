package UnPoPerIlMeme.esamiPatente;

public class Studente {
    private String nome;
    private String cognome;
    private String mail;
    private String telefono;

    public Studente(String n, String c, String m, String t) {
        nome = n;
        cognome = c;
        mail = m;
        telefono = t;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNome(String n) {
        nome = n;
    }

    public void setCognome(String c) {
        cognome = c;
    }

    public void setMail(String m) {
        mail = m;
    }

    public void setTelefono(String t) {
        telefono = t;
    }
}

