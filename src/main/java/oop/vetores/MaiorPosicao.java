package oop.vetores;

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");

        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = scanner.nextDouble();

        }
        double maior = vect[0];
        int posicao = 0;


        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
                posicao = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);

        scanner.close();


    }
}
