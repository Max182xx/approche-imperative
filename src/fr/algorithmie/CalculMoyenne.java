package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {

        //Soit le tableau suivant : int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //• Quelle est la moyenne des éléments du tableau ?
        int moyenne = 0;
        for (int i = 0; i < array.length; i++){
            moyenne += array[i];
        }
        System.out.println("Ma moyenne est de " + moyenne/ array.length);
    }
}
