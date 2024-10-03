package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {5, 15, -3, 6, 7, 5};

        // Calcul de la valeur booléenne
        boolean result = (array.length > 0) && (array[0] == 6 || array[array.length - 1] == 6);

        // Afficher le résultat
        System.out.println("Le tableau satisfait la condition : " + result);
    }
}
