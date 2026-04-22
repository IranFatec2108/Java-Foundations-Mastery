package oop.vetores;

import java.util.Scanner;

public class TemperaturaCalculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dados = scanner.nextLine();
        String[] tempSeparado = dados.split(",");
        int soma = 0;

        for (int i = 0; i < tempSeparado.length ; i++) {
             soma += Integer.parseInt(tempSeparado[i]);

        }
        double media = (double) soma / tempSeparado.length;

        System.out.println("Total de temperaturas registradas: " + tempSeparado.length);

        System.out.printf("Média de temperatura %.2f%n", media);



        scanner.close();
    }
}
