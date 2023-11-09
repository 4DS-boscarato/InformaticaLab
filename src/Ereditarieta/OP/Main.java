package Ereditarieta.OP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Collezione collezione =  null;
        boolean check = false;

        do{
            try{
                System.out.print("Inserisci quanti poligoni vuoi inserire: ");
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


        do {
            try {
                int scelta = sceltaGenerale();

                switch (scelta) {
                    case 1:
                        System.out.println("Inserisci il titolo dell'opera:");
                        String titolo = input.nextLine();

                        System.out.println("Inserisci il nome dell'artista:");
                        String artista = input.nextLine();

                        System.out.println("Inserisci l'altezza:");
                        double altezza = input.nextDouble();

                        System.out.println("Inserisci la larghezza:");
                        double larghezza = input.nextDouble();

                        OperaDarte opera;
                        if (sceltaOpera() == 1) {
                            opera = new Quadro(titolo, artista, altezza, larghezza);
                        } else {
                            System.out.println("Inserisci la profondità:");
                            double profondita = scanner.nextDouble();
                            scanner.nextLine(); // Consuma il carattere di nuova linea
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
        } while (scelta != 2);
    }

    private static int sceltaGenerale() {
        Scanner input = new Scanner(System.in);
        System.out.println("Scegli il tipo di opera:");
        System.out.println("1. Quadro");
        System.out.println("2. Scultura");
        return input.nextInt();
    }
    private static int sceltaOpera() {
        Scanner input = new Scanner(System.in);
        System.out.println("Scegli il tipo di opera:");
        System.out.println("1. Quadro");
        System.out.println("2. Scultura");
        return input.nextInt();
    }
}

