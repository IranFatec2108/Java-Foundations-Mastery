package oop;

import oop.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class RaioExDois {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();

        Calculator calc = new Calculator();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n ", c);
        System.out.printf("Volume:  %.2f%n ", v );
        System.out.printf("PI value:  %.2f%n", calc.PI);


        scanner.close();
    }

}
