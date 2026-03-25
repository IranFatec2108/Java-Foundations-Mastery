package oop.vetores;

import oop.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class DesafioVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rooms will be rented?");
        int n = scanner.nextInt();
        Rent[] locatario = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Email: ");
            String email = scanner.next();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            locatario[room] = new Rent(name, email);


        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (locatario[i] != null) {
                System.out.println(i + ": " + locatario[i]);
            }


        }
        scanner.close();
    }
}
