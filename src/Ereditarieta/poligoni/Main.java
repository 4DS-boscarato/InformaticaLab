package Ereditarieta.poligoni;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int lato;
        int nLato;

        GestionePoligono gP1 = null;
        boolean check = false;

        do{
            try{
                System.out.print("Inserisci quanti poligoni vuoi inserire: ");
                input = new Scanner(System.in);
                int lung = input.nextInt();

                gP1 = new GestionePoligono(lung);
                check = true;
            }
            catch(InputMismatchException e){
                System.out.println("NON VA BENE!  Inserire solo numeri!");
            }
            catch(Exception e){
                System.out.println("NON VA BENE! " + e.getMessage());
            }
        }while(!check);



        System.out.print("\nInserisci Lunghezza lato del quadrato:  ");
        input = new Scanner(System.in);
        lato = input.nextInt();

        Quadrato q1 = new Quadrato(lato);
        gP1.inser(q1);


        System.out.print("\nInserisci Lunghezza lato dell'esagono:  ");
        input = new Scanner(System.in);
        lato = input.nextInt();

        Esagono e1 = new Esagono(lato);
        gP1.inser(e1);


        System.out.print("\nInserisci Lunghezza lato del rombo:  ");
        input = new Scanner(System.in);
        lato = input.nextInt();

        System.out.print("\nInserisci Lunghezza della diagonale maggiore:  ");
        input = new Scanner(System.in);
        float dMagg = input.nextFloat();

        System.out.print("\nInserisci Lunghezza della diagonale minore:  ");
        input = new Scanner(System.in);
        float dMinn = input.nextFloat();

        Rombo r1 = new Rombo(lato, dMagg, dMinn);
        gP1.inser(q1);


        System.out.println("Perimetro quadrato: "+ gP1.perimetroInI(0));
        System.out.println("Perimetro esagono: "+ gP1.perimetroInI(1));
        System.out.println("Perimetro rombo: "+ gP1.perimetroInI(2));

    }
}