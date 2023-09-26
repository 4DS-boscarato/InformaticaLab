package iTTBuonarroti;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        Classe Cl1 = null;
        int lunghezza = 0;

        boolean checkGestRacc = false;

        do{
            try {
                while()
                System.out.print("\nInserire la durata della raccolta: ");
                input = new Scanner(System.in);
                lunghezza = input.nextInt();

                Cl1 = new Classe();
                checkGestRacc = true;
            }
            catch (InputMismatchException e) {
                System.out.println("\nInserire solo numeri!");
            }
            catch(Exception e) {
                System.out.println("\nNon va bene: " + e.getMessage());
            }
        }while(!checkGestRacc);
    }
}

