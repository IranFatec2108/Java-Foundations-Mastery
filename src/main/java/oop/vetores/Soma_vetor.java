package oop.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            vect[i] = scanner.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length ; i++) {
            System.out.print(vect[i] + "  ");
        }
            double sum = 0.0;

        for (int i = 0; i < vect.length ; i++) {
            sum += vect[i];
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);

        double avg = sum / vect.length;

        System.out.printf("MEDIA = %.2f%n", avg);

        scanner.close();
    }
}
