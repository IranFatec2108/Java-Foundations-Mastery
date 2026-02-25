package oop;

import oop.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ConversorMoeda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        System.out.println("What is the dollar price?");
        double cotacao = scanner.nextDouble();
        System.out.println("How many dollars will be bought?");
        double quantidade = scanner.nextDouble();


        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.converter(cotacao, quantidade));

        scanner.close();

    }
}
