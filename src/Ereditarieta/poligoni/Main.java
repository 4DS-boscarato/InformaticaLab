package Ereditarieta.poligoni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int lato;
        int nLato;

        GestionePoligono gP1 = null;
        boolean check = false;

        /*
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
        */

        Quadrato quadrato = null;
        Esagono esagono = null;
        Pentagono pentagono = null;
        Rombo rombo = null;


        try{
            System.out.print("\nInserisci Lunghezza lato del quadrato:  ");
            input = new Scanner(System.in);
            lato = input.nextInt();

            quadrato = new Quadrato(lato);
            //gP1.inser(quadrato);


            System.out.print("\nInserisci Lunghezza lato dell'esagono:  ");
            input = new Scanner(System.in);
            lato = input.nextInt();

            esagono = new Esagono(lato);
            //gP1.inser(esagono);


            System.out.print("\nInserisci Lunghezza lato del pentagono:  ");
            input = new Scanner(System.in);
            lato = input.nextInt();

            pentagono = new Pentagono(lato);
            //gP1.inser(pentagono);


            System.out.print("\nInserisci Lunghezza lato del rombo:  ");
            input = new Scanner(System.in);
            lato = input.nextInt();

            System.out.print("\nInserisci Lunghezza della diagonale maggiore:  ");
            input = new Scanner(System.in);
            float dMagg = input.nextFloat();

            System.out.print("\nInserisci Lunghezza della diagonale minore:  ");
            input = new Scanner(System.in);
            float dMinn = input.nextFloat();

            rombo = new Rombo(lato, dMagg, dMinn);
            //gP1.inser(rombo);
        }
        catch(InputMismatchException e){
            System.out.println("NON VA BENE!  Inserire solo numeri!");
        }
        catch (Exception e){
            System.out.println("NON VA BENE! " + e.getMessage());
        }


        System.out.println(quadrato.toString());
        System.out.println("\nArea: " + quadrato.area());
        System.out.println("Perimetro: " + quadrato.calcolaPerimetro());
        System.out.println("Apotema: " + quadrato.apotema());
        System.out.println("\nDisegno:\n" + quadrato.disegno('*'));

        System.out.println("\n" + rombo.toString());
        System.out.println("\nArea: " + rombo.area());
        System.out.println("Perimetro: " + rombo.calcolaPerimetro());
        System.out.println("Apotema: " + rombo.apotema());
        System.out.println("\nDisegno:\n" + rombo.disegno('*'));

        System.out.println("\n" + esagono.toString());
        System.out.println("\nArea: " + esagono.area());
        System.out.println("Perimetro: " + esagono.calcolaPerimetro());
        System.out.println("Apotema: " + esagono.apotema());
        System.out.println("\nDisegno:\n" + esagono.disegno('*'));

        System.out.println("\n" + pentagono.toString());
        System.out.println("\nArea: " + pentagono.area());
        System.out.println("Perimetro: " + pentagono.calcolaPerimetro());
        System.out.println("Apotema: " + pentagono.apotema());
    }
}