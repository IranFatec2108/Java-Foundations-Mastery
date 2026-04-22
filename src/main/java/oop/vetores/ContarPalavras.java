package oop.vetores;

import java.util.Scanner;

public class ContarPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String frase = scanner.nextLine();

        String[] palavra = frase.split(" ");
        int quantidade = 0;
        for (int i = 0; i < palavra.length ; i++) {
            quantidade++;
        }
    }
}
