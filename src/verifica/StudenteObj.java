package verifica;


public class StudenteObj extends Studente {

    public StudenteObj(){
    }
    public StudenteObj(Integer newCl, Boolean newIsRip, String newCo, String newNo, Data newDN) throws Exception{
        super(newCl, newIsRip, newCo, newNo, newDN);

    }

    protected StudenteObj clone() throws CloneNotSupportedException {
        StudenteObj studenteObj = (StudenteObj) super.clone();
        numeroDiIstanze++;
        return studenteObj;
    }

    public boolean equals(Object oggetto){
        if(oggetto instanceof StudenteObj){
            StudenteObj studenteObj = (StudenteObj) oggetto;

            if(getNome().equals(((StudenteObj) oggetto).getNome()) &&
            getCognome().equals(((StudenteObj) oggetto).getCognome()) &&
            getClasse().equals(((StudenteObj) oggetto).getClasse()) &&
            getRipetente().equals(((StudenteObj) oggetto).getRipetente()) &&
            getDataDiNascita().equals(((StudenteObj) oggetto).getDataDiNascita())){
                if(getVoti().equals(((StudenteObj) oggetto).getVoti())){
                    return true;
                }

            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode();
    }

    protected void finalize() throws Throwable {
        try{
            numeroDiIstanze--;
        }finally {
            super.finalize();
        }
    }

    public String info() throws  Exception{
        if(getNome() != null && getCognome() != null && getClasse() != null && getRipetente() != null && getDataDiNascita() != null){
            return "[" + getNome() + ", " + getCognome() + ", " + getClasse() + ", " + getRipetente() + ", " + getDataDiNascita() + "]";
        }
        else {
            throw new Exception("uno o più attributi sono nulli");
        }

    }

    public String toString() {
        try{
            return info();
        }catch (Exception e) {
            return null;
        }
    }
}
