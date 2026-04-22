package oop.vetores;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] temperaturas = {15, 42, 8, 99, 33};
        int maior = temperaturas [0];
        for (int i = 0; i < temperaturas.length ; i++) {
            if(maior < temperaturas[i]){
                maior = temperaturas[i];
            }

        }
        System.out.println("Maior numere:" + maior);
        scanner.close();
    }
}
