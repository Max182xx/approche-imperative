package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {4, 15, -3, 8, 7, 5}; // Exemple de tableau

        // Calcul de la valeur booléenne
        boolean result = (array.length >= 1) && (array[0] == array[array.length - 1]);

        // Afficher le résultat
        System.out.println("Le tableau satisfait la condition ou non : " + result);
    }
}
