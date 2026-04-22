package oop.vetores;

import java.util.Scanner;

public class CalcTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite as temperaturas: ");

        //Capta os valores das temperaturas
        String dados = scanner.nextLine();

        //usamos o split no nosso array de strings para separar a cada virgula esses arrays, ex: 20 , 30 , 35(arrays menores)
        String[] temperaturasSeparadas = dados.split (",");
        //variavel soma zerada para ganhar valor na junção das temperaturas
        int soma = 0;
        // for para o vetor percorrer todos arrays e somar o valor exato desses strings ao soma de forma convertida a inteiro
        for (int i = 0; i < temperaturasSeparadas.length ; i++) {
            soma  +=  Integer.parseInt(temperaturasSeparadas[i]);
        }

        //variavel de media para pegar o valor total das somas e dividir pela quantidade de numeros(arrays) que foram definidos, com o uso do casting para mudar o tipo
        double avg = (double ) soma / temperaturasSeparadas.length;

        System.out.printf("Média temperaturas: %.2f%n" , avg);


        scanner.close();
    }
}
