
public class Main{
    public static void main(String[] args) throws Exception {

        Polialfabetico p1 = new Polialfabetico("zzzz");

        System.out.println(p1.cifra("ciao"));
        System.out.println(p1.decifra("bhzn"));

        p1.decifraSenzaChiave("bhzn");
    }
}