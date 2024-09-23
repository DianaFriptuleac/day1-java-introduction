public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------EX1--------------------------------------");
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
        String[] newStringArray = FirstMain.inserisciInArray(stringArray, newString);

        //Stampo il mio nuovo array
        System.out.println("Nuovo array con 6 citta:");
        for (String citta : newStringArray){
            System.out.println(citta);
        }

        System.out.println("--------------------------------EX2--------------------------------------");

        SecondMain mySecondExercice = new SecondMain();
        mySecondExercice.insertSting();


        System.out.println("--------------------------------EX3--------------------------------------");

        ThirdMain thirdEx = new ThirdMain();

        //Perimetro del rettangolo
        int lato1 = 10;
        int lato2 = 5;
        System.out.println("Il perimetro del rettangolo è: " + ThirdMain.perimetroRettangolo(lato1, lato2));

        //Pari o dispari
        int thirdNumber = 11;

        boolean isPari = ThirdMain.pariDispari(thirdNumber);
        System.out.println((isPari));

        // Esempio di chiamata del metodo per calcolare l'area di un triangolo
        double l1 = 5.0;
        double l2 = 6.5;
        double l3 = 7.5;

        // AreaTriangolo e stampa il risultato
        double area = ThirdMain.areaTriangolo(l1, l2, l3);
        System.out.println("L'area del triangolo è: " + area);
    }
}