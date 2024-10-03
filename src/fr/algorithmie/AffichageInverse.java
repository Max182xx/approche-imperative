package fr.algorithmie;

// Créer une classe AffichageInverse
public class AffichageInverse {
    public static void main(String[] args) {

        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //• Afficher l’ensemble des éléments du tableau grâce à une boucle
        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        } */

        //• Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        /*for (int i = array.length -1; i >= 0 ; i--) {
            System.out.println(array[i]);
        } */

        //• Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy
        int[] arrayCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i]; // Copier chaque élément
        }

        // Afficher les éléments de arrayCopy pour vérification
        System.out.println("Éléments de arrayCopy :");
        for (int i = 0; i < arrayCopy.length; i++) {
            System.out.println(arrayCopy[i]);
        }
    }
}
