package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int nombreAleatoire = random.nextInt(100)+1;

        int nombreEssais = 0;
        int nombreUtilisateur = 0;
        boolean trouve = false;

        System.out.println("Bienvenue au jeu du Plus ou Moins !");
        System.out.println("J'ai choisi un nombre entre 1 et 100. Essayez de le deviner.");

        while (!trouve) {
            System.out.println("Entrez votre nombre : ");
            nombreUtilisateur = scanner.nextInt();
            nombreEssais++;

            if(nombreUtilisateur < nombreAleatoire){
                System.out.println("C'est plus ! ");
            } else if (nombreUtilisateur > nombreAleatoire){
                System.out.println( "C'est moins ! ");
            } else {
                trouve = true;
                System.out.println("Bavro vous avez trouvé le nombre  est : " + nombreUtilisateur);
            }
        }

        scanner.close();
    }
}
