package Ereditarieta.op;

import java.util.Arrays;

public class Collezione {
    private String nome;
    private String luogo;
    private static OperaDarte[] opere;
    private int numOpere;

    public Collezione(String nomeColl, String luog, int lung) throws Exception{
        checkString(nomeColl);
        checkString(luog);
        opere = new OperaDarte[lung];
    }

    public void inser(OperaDarte oP) throws Exception {
        if(OperaDarte.equals(oP)){
            throw new Exception(" Quest'Opera e` gia` presente!");
        }

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

    public static OperaDarte[] getOpere(){
        return opere;
    }

    private void checkString(String str) throws Exception {
        if(str == null){
            throw new Exception(" Nella stringa passa si trova null!");
        }
        if(str.equals("")){
            throw new Exception(" Nella stringa passata non c'è nulla!");
        }

    }
}
