package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande un nombre
        System.out.println("Entrez un nombre : ");
        int nombre = scanner.nextInt();

        int somme = (nombre * (nombre + 1)) / 2;

        System.out.println("La somme des entiers 1 à " + nombre + "est : " + somme );

        scanner.close();
    }
}
