package puntoCerchio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        float x;
        float y;
        float raggio;
        Cerchio cerch1 = null;
        Centro centr1 = null;

        boolean check = false;
        do{
            try{
                System.out.print("\nInserire la cordinata x: ");
                input = new Scanner(System.in);
                x = input.nextFloat();

                System.out.print("\nInserire la cordinata y: ");
                input = new Scanner(System.in);
                y = input.nextFloat();

                System.out.print("\nInserire il raggio: ");
                input = new Scanner(System.in);
                raggio = input.nextFloat();

                centr1 = new Centro(x, y);
                cerch1 = new Cerchio(centr1, raggio);
                check = true;
            }
            catch (InputMismatchException e) {
                System.out.println("\nInserire solo numeri!");
            }
            catch (Exception e){
                System.out.println("\nHai sbagliato" + e.getMessage());
            }
        }while(!check);

        System.out.println("Il cerchio si trova nei punti x: " + cerch1.getC1().getX() + " e su y: " + cerch1.getC1().getY());
        System.out.println("La circonferenza del cerchio è: " + cerch1.circonferenza());
        System.out.println("L'area del cerchio è: " + cerch1.area());

        System.out.print("\nInserire la percentuale di quanto vuoi ingrandire il cerchio: ");
        input = new Scanner(System.in);
        float percentuale = input.nextFloat();
        cerch1.scala(percentuale);
        System.out.println("Il raggio ora è: " + cerch1.getRaggio());

        System.out.print("\nInserisci di quanto lo vuoi traslare sull'asse x: ");
        input = new Scanner(System.in);
        x = input.nextFloat();

        System.out.print("\nInserisci di quanto lo vuoi traslare sull'asse y: ");
        input = new Scanner(System.in);
        y = input.nextFloat();

        cerch1.traslaSegmento(x, y);
        System.out.println("Il cerchio aggiornato si trova nei punti x: " + cerch1.getC1().getX() + " e su y: " + cerch1.getC1().getY());
    }

}
