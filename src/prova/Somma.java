package prova;


import org.apache.commons.validator.routines.EmailValidator;

public class Somma {
    Integer n1, n2;

    public Somma(Integer n1, Integer n2){
        this.n1 = n1;
        this.n2 = n2;
    }


    public Integer getN1() {
        return n1;
    }
    public Integer getN2() {
        return n2;
    }

    public void setN1(Integer n1) {
        this.n1 = n1;
    }
    public void setN2(Integer n2) {
        this.n2 = n2;
    }

    public String toString() {
        return "Somma{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }
}
