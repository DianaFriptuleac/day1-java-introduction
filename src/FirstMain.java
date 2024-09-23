public class FirstMain {
    //Moltiplicazione di due nr. interi
    public static int moltiplicazione(int x, int y) {
        return x * y;
    }
//Concatena una stringa e un numero
    public static String concatena (String stringa, int numero){
        return stringa + numero;
    }

    // Metodo per inserire una stringa in un array di 5 elementi e restituire un nuovo array di 6 elementi
    public static String[] insertString(String[] array, String newString) {
        String[] newArray = new String[6]; // Nuovo array con 6 elementi

        // Copio i primi 2 elementi nel nuovo array
        for (int i = 0; i < 2; i++) {
            newArray[i] = array[i];
        }

        // Inserisco la nuova stringa nella terza posizione (indice 2)
        newArray[2] = newString;

        // Copio i restanti elementi dell'array originale
        for (int i = 3; i < newArray.length; i++) {
            newArray[i] = array[i - 1];
        }

        return newArray;
    }
}
