package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {

        // Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        // Afficher l’ensemble des éléments du tableau grâce à une boucle
        for (int i = 0; i <= 16; i++) {
            System.out.println(array[i]);
        }
        // Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        for (int i = array.length -1; i >= 0 ; i--) {
            System.out.println(array[i]);
        }
        // Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 32
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 32) {
                System.out.println(array[i]);
            }
        }
        // Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 == 0 ) {
                System.out.println(array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
        for (int i = 0; i < array.length; i++) {
            if (i %2 == 0 ) {
                System.out.println(array[i]);
            }
        }

        // Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0 ) {
                System.out.println(array[i]);
            }
        }
    }
}
