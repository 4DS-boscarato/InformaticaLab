package interfacce.conf;

public class Persona implements Confrontabile{
    private String nome;
    private float altezza;

    Persona(String newN, float newA) throws Exception{
        setNome(newN);
        setAltezza(newA);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) throws Exception {

        this.nome = nome;
    }

    public float getAltezza() {
        return altezza;
    }
    public void setAltezza(float altezza) throws Exception {
        if(altezza <= 0){
            throw new Exception("Valore errato!");
        }
        this.altezza = altezza;
    }


    public Boolean confrontaMaggiore(Confrontabile obj) throws Exception {
        if(!(obj instanceof Persona)){
            throw new Exception("Oggetto non appartenente alla classe Persona!");
        }
        if(((Persona) obj).altezza > altezza){
            return true;
        }else{
            return false;
        }
    }

    public Boolean confrontaMinore(Confrontabile obj) throws Exception {
        if(!(obj instanceof Persona)){
            throw new Exception("Oggetto non appartenente alla classe Persona!");
        }
        if(((Persona) obj).altezza < altezza){
            return true;
        }else{
            return false;
        }
    }


    public Boolean confrontaUguale(Confrontabile obj) throws Exception {
        if(!(obj instanceof Persona)){
            throw new Exception("Oggetto non appartenente alla classe Persona!");
        }
        if(((Persona) obj).altezza == altezza){
            return true;
        }else{
            return false;
        }
    }
}

