package conditional;

import java.util.Scanner;

public class Eixos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva o eixo X e eixo Y:");

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {  // ✅ ANTES dos quadrantes!
            System.out.println("Eixo Y");
        } else if (y == 0.0) {  // ✅ ANTES dos quadrantes!
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {  // ✅ Usa >, não >=
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {  // x > 0 && y < 0
            System.out.println("Q4");
        }

        scanner.close();

    }
}
