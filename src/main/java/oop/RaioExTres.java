package oop;
import oop.util.CalculatorStatic;
import java.util.Locale;
import java.util.Scanner;

public class RaioExTres {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        double radius = scanner.nextDouble();



        double c = CalculatorStatic.circumference(radius);
        double v = CalculatorStatic.volume(radius);

        System.out.printf("Circumference: %.2f%n ", c);
        System.out.printf("Volume:  %.2f%n ", v );
        System.out.printf("PI value:  %.2f%n", CalculatorStatic.PI);


        scanner.close();
    }

}
