package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] array1 ={1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 ={-1, 12, 17, 14, 5, -9, 0, 18 } ;

        //• Créer un tableau qui contient la somme des 2 précédents tableaux
        int maxLength = Math.max(array1.length, array2.length);

        // Créer un tableau pour stocker la somme des éléments
        int[] newArray = new int[maxLength];

        // Parcourir les tableaux pour calculer la somme de chaque élément
        for (int i = 0; i < maxLength; i++) {
            int value1 = (i < array1.length) ? array1[i] : 0;
            int value2 = (i < array2.length) ? array2[i] : 0;
            newArray[i] = value1 + value2;
        }

        // Afficher le tableau qui contient la somme
        System.out.println("Tableau contenant la somme des deux tableaux :");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
