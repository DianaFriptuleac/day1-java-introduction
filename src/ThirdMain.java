public class ThirdMain {
    //Calcolare il perimetro di un rettangolo

    public static int perimetroRettangolo(int lato1, int lato2) {
        //Formula per calcolare il perimetro del rettangolo
        return 2 * (lato1 + lato2);
    }

    // Metodo che controlla se un numero è pari o dispari
    public static boolean pariDispari(int thirdNumber) {
        if (thirdNumber % 2 == 0) {
            System.out.println("Numero " + thirdNumber + " è un numero pari");
            return true;  // Restituisce true se il numero è pari
        } else {
            System.out.println("Numero " + thirdNumber + " è un numero dispari");
            return false;  // Restituisce false se il numero è dispari
        }}

        // Metodo che calcola l'area di un triangolo utilizzando la formula di Erone
        public static double areaTriangolo(double l1, double l2, double l3){
            // Calcola il semiperimetro (s)
            double semiPerimetro = (l1 + l2 + l3) / 2;

            // Calcola l'area utilizzando la formula di Erone
            double area = Math.sqrt(semiPerimetro * (semiPerimetro - l1) * (semiPerimetro - l2) * (semiPerimetro - l3));

            return area;  // Ritorna l'area calcolata

    }}