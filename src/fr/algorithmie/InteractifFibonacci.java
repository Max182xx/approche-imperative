package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de choisir un rang N
        System.out.print("Entrez le rang N pour la suite de Fibonacci : ");
        int n = scanner.nextInt();

        // Vérifier que le nombre N est valide
        if (n < 0) {
            System.out.println("Le rang doit être un nombre positif.");
        } else {
            int resultat = fibonacci(n);
            System.out.println("Le nombre de Fibonacci à rang " + n + " est : " + resultat);
        }
        scanner.close();
    }

    // Fonction pour calculer le nombre de Fibonacci au rang N
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int fib0 = 0;
            int fib1 = 1;
            int fibN = 0;

            for (int i = 2; i <= n; i++) {
                fibN = fib0 + fib1;
                fib0 = fib1;
                fib1 = fibN;
            }

            return fibN;
        }
    }
}
