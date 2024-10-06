package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        // Déclaration d'un tableau d'entiers
        int[] array = {0, 1, 2, 3};

        // Affichage du tableau avant rotation
        System.out.println("Tableau avant rotation : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Rotation à droite des éléments du tableau
        rotateRight(array);

        // Affichage du tableau après rotation
        System.out.println("Tableau après rotation : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Méthode pour effectuer une rotation à droite
    public static void rotateRight(int[] array) {
        if (array.length > 0) {
            int last = array[array.length - 1]; // Stocker le dernier élément

            // Décaler tous les éléments vers la droite
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = last; // Mettre le dernier élément à la première position
        }
    }
}
