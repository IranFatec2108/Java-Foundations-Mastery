package conditional;

import java.util.Scanner;

public class RendaImposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salario = scanner.nextDouble();
        double imposto;

        if (salario >= 0.0 && salario <= 2000.00) {
            System.out.println("Isento");

        } else if (salario <= 3000.00){
            imposto = (salario - 2000) * 0.08;
            System.out.printf("R$ %.2f%n", imposto);

        } else if (salario <= 4500.00){
            imposto = 1000 * 0.08 + (salario - 3000) * 0.18;
            System.out.printf("R$ %.2f%n", imposto);

        } else {
            imposto = 1000 * 0.08 + 1500 * 0.18 + (salario - 4500) * 0.28;
            System.out.printf("R$ %.2f%n", imposto);

        }
        scanner.close();
    }
}
