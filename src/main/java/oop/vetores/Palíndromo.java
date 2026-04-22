package oop.vetores;

import java.util.Scanner;

public class Palíndromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva uma palavra para identificarmos se é um palíndromo: ");
        String palavra = scanner.nextLine();
        palavra = palavra.toUpperCase();
        boolean palindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) == palavra.charAt(palavra.length() - 1 - i)) {
                palindromo = true;
                break;
            }

        }
        if (palindromo) {
            System.out.println("Essa palavra é um palindromo");
        } else {
            System.out.println("Essa palavra não é um palindromo");
        }
        scanner.close();
    }
}