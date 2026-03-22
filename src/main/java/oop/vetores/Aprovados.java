package oop.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int n = scanner.nextInt();

        String [] nome = new String[n];
        double [] nota1 = new double[n];
        double [] nota2 = new double[n];


        for (int i = 0; i < n ; i++){

            System.out.println("Digite nome, primeira e segunda nota do " + (n + 1) + "o aluno: ");
            scanner.nextLine();

            nome[i] = scanner.nextLine();
            nota1[i] = scanner.nextDouble();
            nota2[i] = scanner.nextDouble();
        }

        System.out.println("Alunos Aprovados:");

        for (int i = 0; i  < n ; i++) {
            if((nota1[i] + nota2[i]) / 2 >= 6.0){
                System.out.println(nome[i]);
            }
        }



        scanner.close();
    }
}
