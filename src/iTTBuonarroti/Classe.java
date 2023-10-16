package iTTBuonarroti;


import java.util.Arrays;

public class Classe {
    private Studente capoClasse;
    private Studente[] studenti;

    public Classe(Studente capo, Studente[] stud) throws Exception{
        capoClasse = capo;
        studenti = new Studente[stud.length];
        for(int i = 0; i < stud.length; i++) {
            studenti[i] = new Studente(stud[i]);
        }
    }

    public Studente getCapoClasse() {
        return capoClasse;
    }

    public void setCapoClasse(Studente capoClasse) {
        this.capoClasse = capoClasse;
    }

    public void invertiNC() throws Exception{
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
