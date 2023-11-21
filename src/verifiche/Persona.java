package verifiche;

import org.apache.commons.validator.routines.EmailValidator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Persona {
    private String nome;
    private String cognome;
    private String codFisc;
    private String dataNascita;
    private String email;
    protected static int numeroIstanze;

    public Persona(){
        numeroIstanze++;
    }

    public Persona(Persona p1){
        nome = p1.nome;
        cognome = p1.cognome;
        codFisc = p1.codFisc;
        dataNascita = p1.dataNascita;
        email = p1.email;
        numeroIstanze++;
    }

    public Persona(String newNome, String newCognome, String newCodFisc, String newDataNascita, String newMail) throws Exception {
        setNome(newNome);
        setCognome(newCognome);
        setCodFisc(newCodFisc);
        setDataNascita(newDataNascita);
        setEmail(newMail);
        numeroIstanze++;
    }

    public boolean verificaOmonima(Persona p1){
        return p1.nome.equals(nome) && p1.cognome.equals(cognome);
    }

    public Integer calcolaEta(Persona p1){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dataNascita = LocalDate.parse(p1.getDataNascita(), formatter);

        LocalDate oggi = LocalDate.now();

        return Period.between(dataNascita, oggi).getYears();
    }

    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getCodFisc() {
        return codFisc;
    }
    public String getDataNascita() {
        return dataNascita;
    }
    public String getEmail() {
        return email;
    }
    public static int getNumeroIstanze() {
        return numeroIstanze;
    }

    public void setNome(String nome) throws Exception {
        nome = nome.trim(); //Tolgo tutti gli spazi davanti e dietro
        controlloNominativi(nome);
        this.nome = nome;
    }

    public void setCognome(String cognome) throws Exception {
        cognome = cognome.trim(); //Tolgo tutti gli spazi davanti e dietro
        controlloNominativi(cognome);
        this.cognome = cognome;
    }


    private void controlloNominativi(String nomin) throws Exception {
        if (nomin == null) {
            throw new Exception("Il parametro passato è null!");
        }
        if (nomin.equals("")) {
            throw new Exception("Il parametro passato è vuoto!");
        }


        String[] piuNomi = nomin.split(" ");

        for (int i = 0; i < piuNomi.length; i++) {

            // Controllo che la prima lettera sia maiuscola
            if(piuNomi[i].charAt(0) < 'A' || piuNomi[i].charAt(0) > 'Z') {
                throw new Exception("Trovata lettera non maiuscola nel nome/cognome!");
            }

            for(int j = 1; j < piuNomi[i].length(); j++){

                // Controllo che dentro la parola selezionata siano tutte lettere minuscole
                if(piuNomi[i].charAt(j) < 'a' || piuNomi[i].charAt(j) > 'z') {
                    throw new Exception("Trovata lettera non minuscola nel nome/cognome!");
                }
            }
        }
    }

    public void setCodFisc(String codFisc) throws Exception {
        if(codFisc == null){ // Controllo che la stringa non sia null
            throw new Exception(" Il parametro passato è null!");
        }
        if(codFisc.equals("")){ //Contrllo che la stringa non sia vuota
            throw new Exception(" Il parametro passato è vuoto!");
        }
        if(codFisc.matches("[A-Z+]{6}[0-9+]{2}[A-Z+][0-9+]{2}[A-Z+][0-9+]{3}[A-Z+]$")){ //Regex per controllare il codice Fiscale
            this.codFisc = codFisc;
        }
        else{
            throw new Exception(" Il codice Fiscale non è corretto!");
        }
    }

    public void setDataNascita(String data) throws Exception{
        data = data.trim();

        if(data == null){ // Controllo che la stringa non sia null
            throw new Exception(" la stringa passata è null!");
        }
        if(data.equals("")){ //Contrllo che la stringa non sia vuota
            throw new Exception(" Il stringa passata è vuoto!");
        }
        if(data.equals("[0-9]{2}/[0-9]{2}/[0-9]{4}$")){
            throw new Exception(" la stringa passata non e` valida!");
        }

        int g = (data.charAt(0) - 48) * 10  + (data.charAt(1) - 48);
        int m = (data.charAt(3) - 48) * 10  + (data.charAt(4) - 48);
        int a = ((data.charAt(6) - 48) * 1000)  + ((data.charAt(7) - 48) * 100) + ((data.charAt(7) - 48) * 10) + (data.charAt(7) - 48);

        if(12 < m){
            throw new Exception(" La data non è corretta!");
        }

        switch (m) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (30 <= g) {
                    throw new Exception(" La data non è corretta!");
                }
            }
            case 4, 6, 9, 11 -> {
                if (30 <= g) throw new Exception(" La data non è corretta!");
            }
            case 2 -> {
                if (a % 4 == 0) {
                    if (29 <= g) {
                        throw new Exception(" La data non è corretta!");
                    }
                } else {
                    if (28 <= g) {
                        throw new Exception(" La data non è corretta!");
                    }

                }
            }
        }
        dataNascita = data;
    }

    public void setEmail(String email) throws Exception {
        if(email == null){ // Controllo che la stringa non sia null
            throw new Exception(" Il parametro passato è null!");
        }
        if(email.equals("")){ //Contrllo che la stringa non sia vuota
            throw new Exception(" Il parametro passato è vuoto!");
        }

        EmailValidator eV = EmailValidator.getInstance();

        if(eV.isValid(email)){
            this.email = email;
        }
        else{
            throw new Exception(" La mail non è valida!");
        }
    }

    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", codFisc='" + codFisc + '\'' +
                ", dataNascita='" + dataNascita + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}