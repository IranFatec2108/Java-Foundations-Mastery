package oop.vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.print("Quantas pessoas serao digitados? ");
        int n = scanner.nextInt();

        double [] altura = new double[n];
        char [] sexo = new char[n];

        for (int i = 0; i < n ; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            altura[i] = scanner.nextDouble();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            sexo[i] = scanner.next().charAt(0);
        }

        double alturaMinima = altura[0];
        for (int i = 1; i <n ; i++) {
            if(alturaMinima > altura[i] ){
                alturaMinima = altura[i];
            }
        }

        double maiorAltura = altura[0];
        for (int i = 1; i < n ; i++) {
            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
        }
        double valorTotalMulher = 0.0;
        int quantidadeMulher = 0;
        for (int i = 0; i < n ; i++) {
            if(sexo[i] == 'F'){
                valorTotalMulher += altura[i];
                quantidadeMulher++;
            }
        }
        double avg = valorTotalMulher / (double) quantidadeMulher;

        int qtdHomem = 0;
        for (int i = 0; i < n ; i++) {
            if(sexo[i] == 'M'){
                qtdHomem++;
            }

        }

        System.out.printf("Menor altura = %.2f%n", alturaMinima);
        System.out.printf("Maior altura = %.2f%n", maiorAltura);
        System.out.printf("Media das alturas das mulheres = %.2f%n", avg);
        System.out.println("Numero de homens = " + qtdHomem);
        scanner.close();
    }
}
