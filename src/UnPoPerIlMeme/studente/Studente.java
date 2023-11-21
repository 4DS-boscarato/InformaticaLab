package UnPoPerIlMeme.studente;

import verifiche.Persona;
import java.util.Objects;

public class Studente extends Persona implements Cloneable {
    private String nome;
    private String cognome;
    private String codFisc;
    private String dataNascita;


    public Studente(){
    }

    public Studente(String newNome, String newCognome, String newCodFisc, String newDataNascita){
        nome = newNome;
        cognome = newCognome;
        codFisc = newCodFisc;
        dataNascita = newDataNascita;
    }


    protected Studente clone(){
        Studente tmp = new Studente(nome, cognome, codFisc, dataNascita);
        return tmp.clone();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codFisc='" + codFisc + '\'' +
                ", dataNascita='" + dataNascita + '\'' +
                '}';
    }
}
