package Ereditarieta.OP;

import java.util.Arrays;

public class Collezione {
    private String nome;
    private String luogo;
    private OperaDarte[] opere;
    private int numOpere;

    public Collezione(String nomeColl, String luog) throws Exception{
        setNome(nomeColl);
        setLuogo(luog);
    }

    public void inser(OperaDarte oP){
        opere[numOpere] = oP;
        numOpere++;

        if(numOpere == opere.length){
            opere = Arrays.copyOf(opere, opere.length * 2);
        }
    }

    public double ingombroOperaData(OperaDarte oP){
        return oP.printIngombro();
    }


    public String getNome() {
        return nome;
    }

    public String getLuogo() {
        return luogo;
    }


    public void setNome(String nome) throws Exception {
        if(nome == null){
            throw new Exception(" Nella stringa passa si trova null!");
        }
        if(nome.equals("")){
            throw new Exception(" Nella stringa passata non c'è nulla!");
        }
        this.nome = nome;
    }

    public void setLuogo(String luogo) throws Exception {
        if(luogo == null){
            throw new Exception(" Nella stringa passa si trova null!");
        }
        if(luogo.equals("")){
            throw new Exception(" Nella stringa passata non c'è nulla!");
        }
        this.luogo = luogo;
    }
}
