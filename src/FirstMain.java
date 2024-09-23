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
    public static String[] inserisciInArray(String[] array, String newString) {
        String[] newArray = new String[6]; // Nuovo array con 6 elementi

        for (int i = 0; i <newArray.length; i++){
            //Se i è inferiore a 2, copio gli elementi originali nelle prime due posizioni del nuovo array
            if (i < 2) {
                //Copio i primi due elementi dal vecchio array al nuovo

                newArray[i] = newString;
            } else if (i ==2){
                //Se i è uguale a 2, inserisco la nuova stringa alla terza posizione
                //inserisco la nuova stringa alla posizione 2
                newArray[i] = newString;
            } else {
                //Altrimenti, copio i restanti elementi dal vecchio array, partendo da i - 1, nel nuovo array
                //copia i restanti elementi dal vecchio array al nuovo array
                newArray[i] = array[i - 1];
            }
        }

        return newArray;
    }
}
