import java.util.Scanner;

public class SecondMain {
    Scanner myScanner= new Scanner(System.in);
    // Metodo che chiede all'utente 3 stringhe e stampa la concatenazione in ordine di inserimento e in ordine inverso

    public void insertSting(){
        System.out.println("Inserisci la prima stringa");
        String primaStringa = myScanner.nextLine();

        System.out.println("Inserisci la seconda stringa");
        String secondaStringa = myScanner.nextLine();

        System.out.println("Inserisci la terza stringa");
        String terzaStringa = myScanner.nextLine();

        //Concatena in ordine di inserimento
        String firstConcat = primaStringa + " " + secondaStringa + " " + terzaStringa;
        System.out.println("La prima concatenazione " + firstConcat);

        //Concatenazione in ordine inverso
        String secondConcat = terzaStringa + " "  + secondaStringa + " "  + primaStringa;
        System.out.println("La seconda concatenazione " + secondConcat);

    }


}
