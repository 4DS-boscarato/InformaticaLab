package verifiche;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try{
            Persona pers = new Persona("  Andrea  ", "Boscarato  ", "BSCNDR06H22Z103T", "22/06/2006" ,"andrea.boscarato@hotmail.com");
            Prenotazione prenotaz = new Prenotazione(pers, "19/06/2023","15:06:00");
        }
        catch(Exception e){
            System.out.println("Non va bene! " + e.getMessage());
        }

    }
}
