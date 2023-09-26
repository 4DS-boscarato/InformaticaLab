package esamiPatente;

public class Data{
    private int g;
    private int m;
    private int a;

    public Data(int giorno, int mese, int anno) throws Exception {
        if(checkData(giorno, mese, anno)){
            g = giorno;
            m = mese;
            a = anno;
        }
        else{
            throw new Exception(" Inserisci melgio i giorni della raccolta");
        }
    }

    private boolean checkData(int giorno, int mese, int anno){
        if(mese == 1 || mese == 3 || mese ==  5 || mese == 7 || mese == 8 || mese ==  10 || mese == 12){
            if(0 < giorno  && giorno <= 31){
                return true;
            }
        }else if(mese == 4 || mese == 6 || mese == 9 || mese == 11){
            if(0 < giorno  && giorno <= 30){
                return true;
            }
        }else if(mese == 2){
            if(bisestile(anno)){
                if(0 < giorno  && giorno <= 29){
                    return true;
                }
            }else{
                if(0 < giorno  && giorno <= 28){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean bisestile(int anno){
        boolean divisibilePer4   = (anno % 4 == 0);
        boolean divisibilePer100 = (anno % 100 == 0);
        boolean divisibilePer400 = (anno % 400 == 0);
        return divisibilePer4 && (!divisibilePer100 || divisibilePer400);
    }

    public int getGiorno(){
        return g;
    }

    public int getMese(){
        return m;
    }

    public int getAnno(){
        return a;
    }

    public void setGiorno(int giorno){
        this.g = giorno;
    }

    public void setMese(int mese){
        this.m = mese;
    }

    public void setAnno(int anno){
        this.a = anno;
    }
}