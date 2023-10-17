package UnPoPerIlMeme.melinda;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        GestioneRaccolta gR1 = null;
        int lunghezza = 0;

        boolean checkGestRacc = false;
        do{
            try {
                System.out.print("\nInserire la durata della raccolta: ");
                input = new Scanner(System.in);
                lunghezza = input.nextInt();

                gR1 = new GestioneRaccolta(lunghezza);
                checkGestRacc = true;
            }
            catch (InputMismatchException e) {
                System.out.println("\nInserire solo numeri!");
            }
            catch(Exception e) {
                System.out.println("\nNon va bene: " + e.getMessage());
            }
        }while(!checkGestRacc);

        // MENU
        boolean running = true;
        int scelta = 0;

        do{
            System.out.println("\nMenu");
            System.out.println("1 - Inserire una Raccolta");
            System.out.println("2 - Return del giorno della massima Raccolta");
            System.out.println("3 - Return della somma totale delle Raccolte");
            System.out.println("4 - Return della media totale delle Raccolte");
            System.out.println("5 - Return delle giornate sopra una certa soglia");
            System.out.println("6 - Return della Raccolta di una giornata in base al giorno inserito");
            System.out.println("0 - Uscire");
            System.out.print("\nInserisci il numero della scelta: ");

            input = new Scanner(System.in);
            scelta = input.nextInt();

            switch(scelta) {
                case 1:

                    Data d1 = null;
                    Raccolta r1 = null;
                    boolean checkData = false;

                    do{
                        try {
                            System.out.print("\nInserire il giorno della raccolta: ");
                            input = new Scanner(System.in);
                            int giorno = input.nextInt();

                            System.out.print("\nInserire il mese della raccolta: ");
                            input = new Scanner(System.in);
                            int mese = input.nextInt();

                            System.out.print("\nInserire l'anno della raccolta: ");
                            input = new Scanner(System.in);
                            int anno = input.nextInt();

                            System.out.print("\nInserire i quintali raccolti: ");
                            input = new Scanner(System.in);
                            int quitali = input.nextInt();

                            d1 = new Data(giorno, mese, anno);
                            r1 = new Raccolta(d1, quitali);
                            gR1.nuovaRaccolta(r1);

                            checkData = true;
                        }
                        catch (InputMismatchException e) {
                            System.out.println("\nInserire solo numeri!");
                        }
                        catch(Exception e) {
                            System.out.println("\nNon va bene: " + e.getMessage());
                        }
                    }while(!checkData);

                    System.out.println("\nCOMPLETATO!");
                    break;

                case 2:
                    try{
                        d1 = gR1.gMAxRaccolta();
                        System.out.println("\nLa giornata con il raccolto maggiore è: " +  d1.getGiorno() + "/" + d1.getMese() + "/" + d1.getAnno());
                    }
                    catch(Exception e) {
                        System.out.println("\nNon va bene: " + e.getMessage());
                    }
                    break;

                case 3:
                    try{
                        System.out.println("\nLa somma totale dei raccolti registrati fin'ora è: " + gR1.racSomma());
                    }
                    catch(Exception e) {
                        System.out.println("\nNon va bene: " + e.getMessage());
                    }
                    break;

                case 4:
                    try{
                        System.out.println("\nLa media totale dei raccolti registrati fin'ora è: " + gR1.racMedia());
                    }
                    catch(Exception e) {
                        System.out.println("\nNon va bene: " + e.getMessage());
                    }
                    break;

                case 5:
                    boolean checkSoglia = false;
                    int soglia = 0;
                    do{
                        try {
                            System.out.print("\nInserire la soglia: ");
                            input = new Scanner(System.in);
                            soglia = input.nextInt();

                            checkSoglia = true;
                        }
                        catch (InputMismatchException e) {
                            System.out.println("\nInserire solo numeri!");
                        }
                        catch(Exception e) {
                            System.out.println("\nNon va bene: " + e.getMessage());
                        }
                    }while(!checkSoglia);

                    try{
                        Data[] dateSopraSoglia = new Data[gR1.getDimLog()];
                        int giorniSopraSoglia = gR1.gSopraSoglia(dateSopraSoglia, soglia);

                        String str = "";
                        int cont = 1;
                        for(int i = 0; i < giorniSopraSoglia; i++){
                            str = "\n" + cont + ") " + dateSopraSoglia[i].getGiorno() + "/" + dateSopraSoglia[i].getMese() + "/" + dateSopraSoglia[i].getAnno() ;
                            cont++;
                        }
                        System.out.println("\nLe date sopra la soglia " + soglia + " sono: " + str);
                    }
                    catch(Exception e) {
                        System.out.println("\nNon va bene: " + e.getMessage());
                    }

                    break;

                case 6:
                    checkData = false;

                    do{
                        try {
                            System.out.print("\nInserire il giorno da cercare: ");
                            input = new Scanner(System.in);
                            int giorno = input.nextInt();

                            System.out.print("\nInserire il mese da cercare: ");
                            input = new Scanner(System.in);
                            int mese = input.nextInt();

                            System.out.print("\nInserire l'anno da cercare: ");
                            input = new Scanner(System.in);
                            int anno = input.nextInt();

                            d1 = new Data(giorno, mese, anno);
                            checkData = true;

                            System.out.println("\nI quintali alla data " + giorno +"/"+ mese +"/"+ anno + " sono: " + gR1.qRaccGiornata(d1));
                        }
                        catch (InputMismatchException e) {
                            System.out.println("\nInserire solo numeri!");
                        }
                        catch(Exception e) {
                            System.out.println("\nNon va bene: " + e.getMessage());
                        }
                    }while(!checkData);
                    break;

                default:
                    running = false;
                    break;
            }
        }while(running);
    }
}
