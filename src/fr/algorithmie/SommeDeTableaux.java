package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {

        //{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        //• {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1} ;

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1};

        // Créer un tableau pour stocker la somme des éléments
        int[] newArray = new int[array1.length]; // Les deux tableaux ont la même taille

        // Parcourir les tableaux pour calculer la somme de chaque élément
        for (int i = 0; i < array1.length; i++) {
            newArray[i] = array1[i] + array2[i]; // Somme des éléments correspondants
        }

        // Afficher le tableau qui contient la somme
        System.out.println("Tableau contenant la somme des deux tableaux :");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }

    }
}
