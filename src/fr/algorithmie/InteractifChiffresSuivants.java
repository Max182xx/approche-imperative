package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entre un nombre
        System.out.println("Entrer un nombre");
        int nombre = scanner.nextInt();

        System.out.println(" Les 10 nombres suivants sont : ");
        for (int i = 0; i <= 10; i++){
            System.out.println((nombre + i) + " ");
        }

        scanner.close();

    }
}
