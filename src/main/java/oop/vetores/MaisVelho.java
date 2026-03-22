package oop.vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = scanner.nextInt();

        int [] idade = new int[n];
        String [] nome = new String[n];

        for (int i = 0; i < n ; i++) {
            System.out.print("Dados da " + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = scanner.next();
            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
        }
        int maior = idade[0];
        String maiorPessoa = nome [0];
        for (int i = 1; i < n ; i++) {
            if(idade[i] > maior){
                maior = idade[i];
                maiorPessoa = nome[i];
            }
        }

        System.out.print("PESSOA MAIS VELHA: " + maiorPessoa);


        scanner.close();

    }
}
