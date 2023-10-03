package iTTBuonarroti;

public class Studente {
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

    public void setNome(String n) throws Exception{
        if(n == null){
            throw new Exception(" Stringa contiene null!");
        }
        if(!n.equals("")){
            nome = n;
        }
        else{
            throw new Exception(" Stringa non contiene niente!");
        }
    }

    public void setCognome(String c) throws Exception {
        if(c == null){
            throw new Exception(" Stringa contiene null!");
        }
        for(int i = 0; i < c.length() ; i++){
            if(c.charAt(i) == ' '){

            }
        }
        if(!c.equals("")){
            cognome = c;
        }
        else{
            throw new Exception(" Stringa non contiene niente!");
        }
    }

    public String toString() {
        return "Studente{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + '}';
    }
}
