package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableau = new int[3];
        int nombreElements = 0;

        while (true) {
            // Affichage du menu
            System.out.println("Menu :");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");
            int choix = scanner.nextInt();

            if (choix == 1) {
                // Ajouter un nombre
                System.out.println("Entrez un nombre");
                int nombre = scanner.nextInt();

                // Si le tableau est plein, l'agrandir
                if (nombreElements == tableau.length) {
                    int[] nouveauTableau = new int[tableau.length * 2];
                    for (int i = 0; i < tableau.length; i++) {
                        nouveauTableau[i] = tableau[i];
                    }
                    tableau = nouveauTableau;
                    System.out.println("Le tableau a été agrandi.");
                }

                tableau[nombreElements] = nombre;
                nombreElements++;
                System.out.println("Nombre ajouté avec succès");

            } else if (choix == 2) {
                // Afficher les nombres existants
                if (nombreElements == 0) {
                    System.out.println("Aucun nombre dans le tableau");
                } else {
                    System.out.println("Nombres dans le tableau :");
                    for (int i = 0; i < nombreElements; i++) {
                        System.out.print(tableau[i] + " ");
                    }
                    System.out.println();
                }

            } else if (choix == 3) {
                // Quitter le programme
                System.out.println("Fin du programme.");
                break;
            } else {
                // Gérer les options invalides
                System.out.println("Option invalide, veuillez réessayer.");
            }
        }

        // Fermer le scanner après la boucle
        scanner.close();
    }
}
