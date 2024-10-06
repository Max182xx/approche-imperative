package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE; // Pour stocker le plus grand nombre

        for (int i = 1; i <=10; i++){
            System.out.println("Entre le nombre " + i + " : ");
            int nombre = scanner.nextInt();

            if(nombre > max){
                max = nombre;
            }
        }
        System.out.println("Le plus grand est : " + max);
    }
}
