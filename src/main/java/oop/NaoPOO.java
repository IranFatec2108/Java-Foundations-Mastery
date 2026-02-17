package oop;

import java.util.Locale;
import java.util.Scanner;

public class NaoPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the measures of triangle X: ");
        double xA = scanner.nextDouble();
        double xB = scanner.nextDouble();
        double xC = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        double yA = scanner.nextDouble();
        double yB = scanner.nextDouble();
        double yC = scanner.nextDouble();

        double valuePX = (xA + xB + xC) / 2.0;
        double valuePY = (yA + yB + yC) / 2.0;

        double areaX = Math.sqrt(valuePX * (valuePX - xA) * (valuePX - xB) * (valuePX - xC));

        double areaY = Math.sqrt(valuePY * (valuePY - yA) * (valuePY - yB) * (valuePY - yC));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area : X");
        }else{
            System.out.println("Larger area : Y");
        }


        scanner.close();

    }
}
