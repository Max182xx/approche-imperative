package fr.tableaux;

import javax.xml.transform.Source;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {

        //Déclarez un tableau d’entiers contenant tous les chiffres suivants : 8, -7, 12, 1, -2, 14, 17, 9
        int[] tab = {8,-7,12,1,-2,14,17,9};

        //Affichez l’élément du tableau d’index 0 du tableau
        System.out.println(tab[0]);

        //Affichez la longueur du tableau
        System.out.println(tab.length);

        //Affichez l’entier positionné au dernier index du tableau
        System.out.println(tab[tab.length -1]);

        /*Affichez l’entier d’index 10. Pourquoi cela échoue ? Affichez un commentaire dans
        votre code pour l’expliquer.*/

        // Il n'y a pas d'index 10
    }
}
