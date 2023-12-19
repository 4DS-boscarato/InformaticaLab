package verifica;


public class Main {
    public static void main(String[] args) throws Exception {
        Data d1 = new Data(20,12,2006);
        Data d2 = new Data(15,7,2014);

        Persona p1 = new Persona("Boscarato", "Andrea", d1);
        Persona p2 = new Persona("Pancrazzi", "Luca", d2);
        Studente st1 = new Studente(3, true, "Baracletti", "Alex", d2);
        Studente st2 = new Studente(3, true, "Boscarato", "Andrea", d1);


        //Per poter utilizzare i voti bisogna prima dichiarare un'array nel main e poi chiamare
        //il setVoti passandogli un'array

        //Polimorfismo dei metodi
        System.out.println(p1.info());
        System.out.println("\n-----\n");
        System.out.println(st1.info());

        //Polimorfismo degli oggetti
        System.out.println("\n-----\n");
        System.out.println(p1.verificaOmonimia(p2));
        System.out.println(st1.verificaOmonimia(st2));


        //Casting

        //Non posso assegnare una madre alla figlia
        //st1 = (Studente) p1;

        //Ma posso assegnare una madre alla figlia
        System.out.println("\n-----\n");
        System.out.println(p1.info());
    }
}