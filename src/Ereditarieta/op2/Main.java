package Ereditarieta.op2;

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
        int nAzioni = 0;

        do {
            try {
                scelta = sceltaGenerale();

                switch (scelta) {
                    case 1:

                        //Primo Input OPERA
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

                        //Secondo Input CONTENITORE
                        System.out.println("Inserisci l'altezza del dove verrà messa l'opera: ");
                        input = new Scanner(System.in);
                        double alt = input.nextDouble();

                        System.out.println("Inserisci la larghezza del dove verrà messa l'opera: ");
                        input = new Scanner(System.in);
                        double larg = input.nextDouble();

                        OperaDarte opera;
                        if(sceltaOpera() == 1) {
                            //Terzo Input CONTENITORE
                            System.out.println("Inserisci lo spessore della cornice: ");
                            input = new Scanner(System.in);
                            double spes = input.nextDouble();

                            Cornice c1 = new Cornice(alt, larg, spes);
                            opera = new Quadro(titolo, artista, altezza, larghezza, c1);
                        }
                        else {
                            //Terzo Input OPERA
                            System.out.println("\nInserisci la profondità della Scultura: ");
                            input = new Scanner(System.in);
                            double profondita = input.nextDouble();

                            //Quarto Input CONTENITORE
                            System.out.println("Inserisci lo profondità del supporto della Scultura: ");
                            input = new Scanner(System.in);
                            double spes = input.nextDouble();

                            Supporto s1 = new Supporto(alt, larg, spes);

                            opera = new Scultura(titolo, artista, altezza, larghezza, profondita, s1);
                        }
                        collezione.inser(opera);
                        nAzioni++;
                        break;

                    case 2:
                        if(nAzioni == 0) {
                            System.out.println("\nNon puoi!");
                            break;
                        }
                        System.out.println("\nInserire il numero dell'opera da selezionare: ");
                        input = new Scanner(System.in);
                        int sceltaOpera = input.nextInt();

                        sceltaOpera -= 1;
                        OperaDarte[] oP = Collezione.getOpere();

                        if(sceltaOpera <= oP.length){
                            System.out.println("L'ingombro dell'opera data e` " + collezione.ingombroOperaData(oP[sceltaOpera]));
                        }
                        else{
                            System.out.println("Non e` presente quest'Opera");
                        }

                        nAzioni++;
                        break;

                    case 3:
                        System.out.println("Uscita dal programma.");
                        break;

                    default:
                        System.out.println("Scelta non valida. Riprova.");
                        break;
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } while(scelta != 3);
    }

    private static int sceltaGenerale() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenù");
        System.out.println("1. Inserisci");
        System.out.println("2. Ingombro Opera");
        System.out.println("3. Esci");
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



