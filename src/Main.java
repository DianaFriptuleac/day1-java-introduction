public class Main {
    public static void main(String[] args) {
//Moltiplicazione
        int nr1 = 10;
        int nr2 = 2;
        System.out.println("Il risultato della moltiplicazione è " + FirstMain.moltiplicazione(nr1, nr2));

        //Concatenare la stringa e il nr intero
        String mystring = "Il numero intero è ";
        int mynumber = 10;

        System.out.println("Concatena stringa e numero: " + FirstMain.concatena(mystring, mynumber));

        //Una nuova stringa in un array e restituire un array di 6 elementi
        // Array originale con 5 elementi
        String[] stringArray = {"Milano", "Roma", "Napoli", "Modena", "Bologna"};
        // Nuova stringa da inserire
        String newString = "Padova";

        // Chiamo il metodo insertString per ottenere il nuovo array con 6 elementi dentro
        String[] newStringArray = FirstMain.insertString(stringArray, newString);

        //Stampo il mio nuovo array
        System.out.println("Nuovo array con 6 citta:");
        for (String citta : newStringArray){
            System.out.println(citta);
        }

    }
}