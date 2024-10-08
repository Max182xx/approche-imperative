package fr.algorithmie;

//Créer une classe InversionContenu
public class InversionContenu {
    public static void main(String[] args) {

        //• Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        //• Créer un tableau arrayCopy et copier tous les éléments de array dans arrayCopy maisdans l’ordre inverse.
        int[] arrayCopy = new int[array.length];

        //• Afficher l’ensemble des éléments des 2 tableaux
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            for (int a = 0; a < array.length; a++) {
                arrayCopy[a] = array[a]; // Copier chaque élément
            }

            // Afficher les éléments de arrayCopy pour vérification
            System.out.println("Éléments de arrayCopy :");
            for (int a = array.length - 1; a >= 0; a--) {
                System.out.println(arrayCopy[a]);
            }
        }
    }
}
