package oop.vetores;

import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int n = scanner.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = scanner.nextInt();
        }
        int negativos = 0;

        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i = 0; i < vect.length ; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

            scanner.close();
    }
}
