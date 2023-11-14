package Ereditarieta.op;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Collezione collezione =  null;
        boolean check = false;

        do{
            try{
                System.out.print("Inserisci quante opere vuoi inserire: ");
                input = new Scanner(System.in);
                int lung = input.nextInt();

                collezione = new Collezione("Collezione d'arte", "Museo", lung);
                check = true;
            }
            catch(InputMismatchException e){
                System.out.println("NON VA BENE!  Inserire solo numeri!");
            }
            catch(Exception e){
                System.out.println("NON VA BENE! " + e.getMessage());
            }
        }while(!check);

        int scelta = 0;

        do {
            try {
                scelta = sceltaGenerale();

                switch (scelta) {
                    case 1:
                        System.out.println("\nInserisci il titolo dell'opera: ");
                        input = new Scanner(System.in);
                        String titolo = input.nextLine();

                        System.out.println("Inserisci il nome dell'artista: ");
                        input = new Scanner(System.in);
                        String artista = input.nextLine();

                        System.out.println("Inserisci l'altezza: ");
                        input = new Scanner(System.in);
                        double altezza = input.nextDouble();

                        System.out.println("Inserisci la larghezza: ");
                        input = new Scanner(System.in);
                        double larghezza = input.nextDouble();

                        OperaDarte opera;
                        if (sceltaOpera() == 1) {
                            opera = new Quadro(titolo, artista, altezza, larghezza);
                        }
                        else {
                            System.out.println("\nInserisci la profondità: ");
                            input = new Scanner(System.in);
                            double profondita = input.nextDouble();

                            opera = new Scultura(titolo, artista, altezza, larghezza, profondita);
                        }
                        collezione.inser(opera);
                        break;

                    case 2:
                        System.out.println("Uscita dal programma.");
                        break;

                    default:
                        System.out.println("Scelta non valida. Riprova.");
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } while(scelta != 2);
    }

    private static int sceltaGenerale() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenù");
        System.out.println("1. Inserisci");
        System.out.println("2. Esci");
        System.out.print("Scelta: ");
        return input.nextInt();
    }
    private static int sceltaOpera() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nScegli il tipo di opera:");
        System.out.println("1. Quadro");
        System.out.println("2. Scultura");
        System.out.print("Scelta: ");
        return input.nextInt();
    }
}

