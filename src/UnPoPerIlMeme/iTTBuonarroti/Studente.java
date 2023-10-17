package UnPoPerIlMeme.iTTBuonarroti;

import java.util.regex.*;

public class Studente {
    private String nome;
    private String cognome;

    public Studente(String n, String c) throws Exception {
        setNome(n);
        setCognome(c);
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

    private void checkString(String str) throws Exception {

        String regex = "^[A-ZÀ-ÿ][a-zà-ÿ'\\s]*$";
        str = str.trim(); //toglie spazi davanti e alla fine

        if(!str.matches(regex)) {
            throw new Exception("Nome o cognome non validi!");
        }
        if(str.contains("  ")) {
            throw new Exception("Non puoi inserire più di 1 spazio dietro ad un altro!");
        }
    }

/*
    private void checkString(String str) throws Exception {
        char[] strS = str.toCharArray();
        int nSpazi = 0;

        if(strS[0] >= 65 && strS[0] <= 90){
            for(int i = 1; i < strS.length; i++){
                if(strS[i] == ' '){
                    if(strS[i+1] != ' '){
                        nSpazi++;
                        if(!(strS[i+1] >= 65 && strS[i+1] <= 90)) {
                            throw new Exception(" Lettera Iniziale della " + nSpazi + " parola non valida!");
                        }
                        i++;
                    }
                    else {
                        throw new Exception(" Non puoi inserire più di 1 spazio dietro ad un'altro!");
                    }
                }
                else{
                    if(!(strS[i] >= 97 && strS[i] <= 122)){
                        throw new Exception(" Le lettere inserite sono diverse da quelle normali (No maiuscole, No caratteri speciali)!");
                    }
                }
            }
        }
        else{
            throw new Exception(" Lettera prima Iniziale non valida!");
        }
    }
*/

    public void setNome(String n) throws Exception{
        if(n == null){
            throw new Exception(" Stringa contiene solo null!");
        }
        if(n.equals("")) {
            throw new Exception(" Stringa non contiene niente!");
        }
        checkString(n);
        nome = n;
    }

    public void setCognome(String c) throws Exception {
        if(c == null){
            throw new Exception(" Stringa contiene solo null!");
        }
        if(c.equals("")) {
            throw new Exception(" Stringa non contiene niente!");
        }
        checkString(c);
        cognome = c;
    }

    public String toString() {
        return "Studente{" + "nome='" + nome + '\'' + ", cognome='" + cognome + '\'' + '}';
    }
}
