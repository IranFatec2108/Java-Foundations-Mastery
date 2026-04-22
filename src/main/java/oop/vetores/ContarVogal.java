package oop.vetores;

import java.util.Scanner;

public class ContarVogal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Escreva uma palavra para ser identificado a quantidade de vogais: ");

        //variavel para ser digitado a palavra
        String palavra = scanner.nextLine();
        palavra = palavra.toUpperCase();

        // quantidade de vogais que existirá
        int quantidadeVogal = 0;
        //loop para percorrrer a palavra
        for (int i = 0; i < palavra.length();  i++) {
            // fazemos um casting para tranformar a string em um char "mapeavel" vazendo a variavel identificar cada letra da palavra em forma de vetor
            char letra = palavra.charAt(i);
            //condicional para se existirem vogais, somar 1 no valor da quantidadeVogal
            if (letra == 'i' || letra == 'u' || letra == 'o' || letra == 'a' || letra == 'e' ){
                quantidadeVogal ++;
            }

        }
        System.out.println("Vogais = " + quantidadeVogal);

        scanner.close();
    }
}
