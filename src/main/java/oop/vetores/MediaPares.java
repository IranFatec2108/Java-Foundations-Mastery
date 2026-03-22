package oop.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = scanner.nextInt();

        int [] vect = new int[n];
        int pares = 0;
        int paresMedia = 0;

        //atribui ao vetor os valores
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }
        //Atribuimos a variavel 'pares' todos os valores do numeros pares e ao 'paresMedia' o valor de +1 a cada valor que corresponde o condicional, para 'mapearmos' a poição par
      for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                pares += vect[i];
                paresMedia++;
            }
        }

      //condicional que exige paresMedia ter um valor minimo para criar a variavel avg e imprimir o resultado
        if (paresMedia == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else{
            double avg = (double) pares / paresMedia;
            System.out.printf("MEDIA DOS PARES = %.1f%n", avg);

        }


        scanner.close();

    }
}
