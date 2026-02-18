package oop;
import oop.entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RectangleMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");

        rectangle.width = scanner.nextDouble();
        rectangle.height = scanner.nextDouble();

        System.out.printf("AREA = %.2f%n", rectangle.area());
        System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());


        scanner.close();
    }
}