package Ereditarieta.poligoniDisegnati;

public class Main {
    public static void main(String[] args) {
        Rombo rombo = new Rombo(5, 3, 4);
        System.out.println("Rombo: ");
        System.out.println(rombo.disegno('*'));

        Quadrato quadrato = new Quadrato(10);
        System.out.println("Quadrato: ");
        System.out.println(quadrato.disegno('*'));
    }
}
