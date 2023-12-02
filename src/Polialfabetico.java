import java.math.BigInteger;

public class Polialfabetico{
    private String key;

    public Polialfabetico(String newKey) throws Exception {
        checkStr(newKey);
        key = newKey;
    }


    private void checkStr(String messaggio) throws Exception {
        if(messaggio.equals("")){
            throw new Exception("Messaggio Vuoto");
        }
        if(messaggio == null){
            throw new Exception("Messaggio nullo");
        }

        messaggio = messaggio.trim();
        messaggio = messaggio.toLowerCase();
    }

    public String cifra(String messaggio) throws Exception {
        checkStr(messaggio);
        String risultato = "";

        int j = 0;
        for(int i = 0; i < messaggio.length(); i++) {
            char carattere = messaggio.charAt(i);
            if(Character.isLetter(carattere)){
                j = j % key.length();
                char nuovoCarattere = (char) (((carattere - 'a') + (key.charAt(j) - 'a')) % 26 + 'a');

                risultato += nuovoCarattere;
                j++;
            }
            else{
                risultato += ' ';
            }
        }
        return risultato;
    }

    public String decifra(String messaggio) throws Exception {
        checkStr(messaggio);
        String risultato = "";

        int j = 0;
        for(int i = 0; i < messaggio.length(); i++) {
            char carattere = messaggio.charAt(i);

            if(Character.isLetter(carattere)){
                j = j % key.length();
                char nuovoCarattere = (char) (((carattere - 'a') - (key.charAt(j) - 'a') + 26) % 26 + 'a');

                risultato += nuovoCarattere;
                j++;
            }
            else{
                risultato += ' ';
            }
        }
        return risultato;
    }

    public boolean controlloCripatggio(String messCifrato, String messChiaro) throws Exception {
        checkStr(messCifrato);
        checkStr(messChiaro);

        if(decifra(messCifrato).equals(messChiaro)){
            return true;
        }
        else{
            return false;
        }
    }

    public String esempioCifratura() throws Exception {
        String stringa = "";
        stringa = stringa + "ciao -> " + cifra("ciao");
        return stringa;
    }


    private void PrintTentativo(String tentativo, String chiave){
        System.out.println( "Chiave: " + chiave + ", Tentativo: " + tentativo);
    }

    public String cifra(String messaggio, String key) throws Exception {
        checkStr(messaggio);
        String risultato = "";

        int j = 0;
        for(int i = 0; i < messaggio.length(); i++) {
            char carattere = messaggio.charAt(i);

            if(Character.isLetter(carattere)){
                j = j % key.length();
                char nuovoCarattere = (char) (((carattere - 'a') + (key.charAt(j) - 'a')) % 26 + 'a');

                risultato += nuovoCarattere;
                j++;
            }
            else{
                risultato += ' ';
            }
        }
        return risultato;
    }

    public void decifraSenzaChiave(String messaggioCifrato) throws Exception {
        checkStr(messaggioCifrato);

        int lunghezzaMessaggio = messaggioCifrato.length();

        for (int lunghezzaChiave = 1; lunghezzaChiave <= lunghezzaMessaggio; lunghezzaChiave++) {
            int numeroCombinazioni = (int) Math.pow(26, lunghezzaChiave);

            for (int i = 0; i < numeroCombinazioni; i++) {
                StringBuilder keyTentativo = new StringBuilder();

                for (int j = 0; j < lunghezzaChiave; j++) {
                    int posizione = (i / (int) Math.pow(26, j)) % 26;
                    char currentKeyChar = (char) ('a' + posizione);

                    keyTentativo.insert(0, currentKeyChar); // Inseriamo il carattere all'inizio della stringa per ottimizzazione
                }

                // Passa all'altro metodo
                String messaggioDecifrato = cifra(messaggioCifrato, keyTentativo.toString());

                // Per printare il risultato
                PrintTentativo(messaggioDecifrato, keyTentativo.toString());
            }
        }
    }
}

