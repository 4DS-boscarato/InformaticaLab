package iTTBuonarroti;

import java.util.Arrays;

public class Classe{
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capo, Studente[] stud){
        studenti = new Studente[stud.length];
        for(int i = 0; i < stud.length; i++){
            if(stud[i].getNome().length() <= 3 && stud[i].getCognome().length() <= 3){
                if(stud[i].getNome().contains("/") && stud[i].getNome().contains("#") && stud[i].getNome().contains("*") && stud[i].getCognome().contains("/") && stud[i].getCognome().contains("#") && stud[i].getCognome().contains("*")){
                    stud[i].setNome(stud[i].getNome().substring(0,1).toUpperCase() + stud[i].getNome().substring(1));
                    stud[i].setCognome(stud[i].getCognome().substring(0,1).toUpperCase() + stud[i].getCognome().substring(1));
                    studenti[i] = new Studente(stud[i]);
                }
                else{
                    studenti[i] = new Studente("null", "null");
                }

            }
            else{
                studenti[i] = new Studente("null", "null");
            }
        }
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public void invertiAttributi(){
        for(int i = 0; i < studenti.length; i++){
            String temp = studenti[i].getNome();
            studenti[i].setNome(studenti[i].getCognome());
            studenti[i].setCognome(temp);
        }
    }

    public String toString() {
        return "Classe{" + "capoClasse=" + capoClasse + ", studenti=" + Arrays.toString(studenti) + '}';
    }
}
