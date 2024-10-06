package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre;

        do{
            System.out.println(" Entre un nombre entre 1 est 10 : ");
            nombre = scanner.nextInt();

            if (nombre < 1 || nombre > 10) {
                System.out.println("Le nombre n'est pas valide");
            }
        } while ( nombre < 1 || nombre > 10);

        System.out.println( "Table de " + nombre + " :");

        for (int i = 1 ; i <= 10; i++) {

            System.out.println(nombre + " * " + i + " = " + (nombre * i));
        }

        scanner.close();
    }
}
