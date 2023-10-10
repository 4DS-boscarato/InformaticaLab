package iTTBuonarroti;


public class Main2 {
    public static void main(String[] args) {
        try{
            Studente stud = new Studente("De Luca", "Daniele Paoli");
            System.out.println("Nome: " + stud.getNome() + "\nCognome: " + stud.getCognome());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}