package oop.vetores;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");

        int n = scanner.nextInt();
        int[] vect = new int[n];

        //atribui ao array os valores impressos pelo usuario
        for (int i = 0; i < vect.length ; i++) {
           vect[i] = scanner.nextInt();

        }

        System.out.println("\nNUMEROS PARES" );


        // criamos uma variavel inteira que dentro do laço de repetição for, para cada numero par, soma 1 na quantidade de pares
            int qtdpares = 0;
            for (int i=0; i<n; i++) {
                if (vect[i] % 2 == 0) {
                    System.out.printf("%d  ", vect[i]);
                    qtdpares++;
                }
            }
            //imprime a quantidade de pares

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);

        scanner.close();

    }
}
