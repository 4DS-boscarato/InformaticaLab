package Ereditarieta.I3Punti;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n______ Punto Base ______");
        System.out.print("Inserisci la x: ");
        input = new Scanner(System.in);
        float x = input.nextFloat();

        System.out.print("Inserisci la y: ");
        input = new Scanner(System.in);
        float y = input.nextFloat();

        Punto p1 = new Punto(x, y);


        System.out.println("\n______ Punto 3D ______");
        System.out.print("Inserisci la x: ");
        input = new Scanner(System.in);
        x = input.nextFloat();

        System.out.print("Inserisci la y: ");
        input = new Scanner(System.in);
        y = input.nextFloat();

        System.out.print("Inserisci la z: ");
        input = new Scanner(System.in);
        float z = input.nextFloat();

        Punto3D pD1 = new Punto3D(x, y, z);


        System.out.println("\n______ Punto Colorato ______");
        System.out.print("Inserisci la x: ");
        input = new Scanner(System.in);
        x = input.nextFloat();

        System.out.print("Inserisci la y: ");
        input = new Scanner(System.in);
        y = input.nextFloat();

        System.out.print("Inserisci il colore: ");
        input = new Scanner(System.in);
        String color = input.nextLine();

        PuntoColorato pC1 = new PuntoColorato(x, y, color);



        System.out.println("\n______ Punto Base ______");
        System.out.println("Inserisci la x da traslare: ");
        input = new Scanner(System.in);
        float xT = input.nextFloat();

        System.out.println("Inserisci la y da traslare: ");
        input = new Scanner(System.in);
        float yT = input.nextFloat();

        p1.traslaPunto(xT, yT);


        System.out.println("\n______ Punto 3D ______");
        System.out.println("Inserisci la x da traslare: ");
        input = new Scanner(System.in);
        xT = input.nextFloat();

        System.out.println("Inserisci la y da traslare: ");
        input = new Scanner(System.in);
        yT = input.nextFloat();

        System.out.println("Inserisci la z da traslare: ");
        input = new Scanner(System.in);
        float zT = input.nextFloat();

        pD1.traslaPunto(xT, yT);


        System.out.println("\n______ Punto Colorato ______");
        System.out.println("Inserisci la x da traslare: ");
        input = new Scanner(System.in);
        xT = input.nextFloat();

        System.out.println("Inserisci la y da traslare: ");
        input = new Scanner(System.in);
        yT = input.nextFloat();

        pC1.traslaPunto(xT, yT);


        System.out.println("______ Punto Base: " + p1.toString());
        System.out.println("______ Punto 3D: " + pD1.toString());
        System.out.println("______ Punto Colorato: " + pC1.toString());
    }
}