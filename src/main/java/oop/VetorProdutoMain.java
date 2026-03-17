package oop;

import oop.entities.ProdutoVetor;

import java.util.Locale;
import java.util.Scanner;

public class VetorProdutoMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ProdutoVetor[] vect = new ProdutoVetor[n];

        for(int i = 0; i < vect.length; i++){
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            vect[i] = new ProdutoVetor(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < vect.length ; i++) {
            sum += vect [i].getPrice();
        }

        double svg = sum / vect.length;

        System.out.printf("AVEREGE PRICE = %.2f%n", svg);
        scanner.close();
    }
}
