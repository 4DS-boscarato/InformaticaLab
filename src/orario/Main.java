package orario;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Orario Or = null;

        boolean checkOrario = false;
        do{
            try {
                System.out.print("\nInserire l'ora: ");
                input = new Scanner(System.in);
                int ora = input.nextInt();

                System.out.print("Inserire i minuti: ");
                input = new Scanner(System.in);
                int minuti = input.nextInt();

                System.out.print("Inserire i secondi: ");
                input = new Scanner(System.in);
                int secondi = input.nextInt();

                Or = new Orario(ora, minuti, secondi);
                checkOrario = true;
            }
            catch (InputMismatchException e) {
                System.out.println("\nInserire solo numeri!");
            }
            catch(Exception e) {
                System.out.println("\nNon va bene: " + e.getMessage());
            }

        }while(!checkOrario);

        boolean running = true;
        int scelta = 0;

        do{
            System.out.println("\nMenu");
            System.out.println("1 - Modificare l'orario");
            System.out.println("2 - Orario dalla mezzanotte in ore");
            System.out.println("3 - Orario dalla mezzanotte in minuti");
            System.out.println("4 - Orario dalla mezzanotte in secondi");
            System.out.println("5 - Restituzione orario attuale");
            System.out.println("0 - Uscire");
            System.out.print("\nInserisci il numero della scelta: ");

            input = new Scanner(System.in);
            scelta = input.nextInt();

            switch(scelta) {
            case 1:

                System.out.println("\nCosa vuoi modificare? ");
                System.out.println("1 - ora");
                System.out.println("2 - minuti");
                System.out.println("3 - secondi");
                input = new Scanner(System.in);
                int sceltaModifica = input.nextInt();

                if(sceltaModifica == 1){
                    try{
                        System.out.print("\nInserire l'ora modificata: ");
                        input = new Scanner(System.in);
                        int ora = input.nextInt();

                        Or.setOra(ora);
                    }
                    catch (InputMismatchException e) {
                        System.out.println("\nInserire solo numeri!");
                    }
                    catch(Exception e) {
                        System.out.println("\nNon va bene: " + e.getMessage());
                    }
                }

                else if(sceltaModifica == 2){
                    try{
                        System.out.println("\nInserire i minuti modificati: ");
                        input = new Scanner(System.in);
                        int minuti = input.nextInt();

                        Or.setMinuti(minuti);
                    }
                    catch (InputMismatchException e) {
                        System.out.println("\nInserire solo numeri!");
                    }
                    catch(Exception e) {
                        System.out.println("\nNon va bene: " + e.getMessage());
                    }
                }

                else if (sceltaModifica == 3){
                    try{
                        System.out.println("\nInserire i secondi modificati: ");
                        input = new Scanner(System.in);
                        int secondi = input.nextInt();

                        Or.setSecondi(secondi);
                    }
                    catch (InputMismatchException e) {
                        System.out.println("\nInserire solo numeri!");
                    }
                    catch(Exception e) {
                        System.out.println("\nNon va bene: " + e.getMessage());
                    }
                }
                System.out.println("\nCOMPLETATO!");
                break;

            case 2:
                System.out.println("\nLe ore passate dalla mezzanotte sono: " + Or.oraFromMidNight());
                break;

            case 3:
                System.out.println("\nI minuti passati dalla mezzanotte sono: " + Or.minFromMidNight());
                break;

            case 4:
                System.out.println("\nI secondi passati dalla mezzanotte sono: " + Or.secFromMidNight());
                break;

            case 5:
                System.out.println(Or.toString());

            default:
                running = false;
                break;
            }
        }while(running);
    }
}