package fr.tableaux;


public class ExerciceTableauChaines {
    public static void main(String[] args) {

        //Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix.
        String[] City = {"Montpellier", "Toulon", "Nîmes", "Bordeaux" , "Marseille"};


        // Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
        City[3] = "Reims";

        //Affichez la longueur du tableau
        System.out.println(City.length);

        //Affichez les 5 éléments du tableau après modification
        //Affichez les 5 éléments du tableau
        System.out.println(City[0]);
        System.out.println(City[1]);
        System.out.println(City[2]);
        System.out.println(City[3]);
        System.out.println(City[4]);

    }
}
