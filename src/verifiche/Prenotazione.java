package verifiche;

public class Prenotazione {
    private Persona persona;
    private String data;
    private String ora;

    public Prenotazione(Persona p1, String newData, String newOra) throws Exception{
        persona = new Persona(p1);
        setData(newData);
        setOra(newOra);
    }

    public Persona getPersona() {
        return persona;
    }

    public String getData() {
        return data;
    }

    public String getOra() {
        return ora;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setData(String data) throws Exception{
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

        /*
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
        */

        this.data = data;
    }

    public void setOra(String ora) throws Exception {
        ora = ora.trim();


        if(ora == null){ // Controllo che la stringa non sia null
            throw new Exception(" la stringa passata è null!");
        }
        if(ora.equals("")){ //Contrllo che la stringa non sia vuota
            throw new Exception(" Il stringa passata è vuoto!");
        }
        if(ora.equals("[0-9]{2}:[0-9]{2}:[0-9]{2}$")){
            throw new Exception(" la stringa passata non e` valida!");
        }

        int o = (ora.charAt(0) - 48) * 10  + (ora.charAt(1) - 48);
        int m = (ora.charAt(3) - 48) * 10  + (ora.charAt(4) - 48);
        int s = (ora.charAt(6) - 48) * 10  + (ora.charAt(7) - 48);

        if(24 <= o){
            throw new Exception(" L'ora non è corretta!");
        }
        if(59 <= m){
            throw new Exception(" L'ora non è corretta!");
        }
        if(59 <= s){
            throw new Exception(" L'ora non è corretta!");
        }
        this.ora = ora;
    }

    public String toString() {
        return "[[ nome = " + persona.getNome() + ", cognome = " + persona.getCognome() + ", codFisc = " + persona.getCodFisc() + " ]" + ", data = " + data + ", ora = " + ora + " ]";
    }
}

