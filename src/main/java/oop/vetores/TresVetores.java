package oop.vetores;

import java.util.Scanner;

public class TresVetores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor?");
        int n = scanner.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];

        int valorA = 0;
        int valorB = 0;



        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            vectA[i] = scanner.nextInt();
            valorA += vectA[i];
        }


        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            vectB[i] = scanner.nextInt();
            valorB += vectB[i];

        }

        for (int i = 0; i < n ; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);

        }
        scanner.close();
    }
}
