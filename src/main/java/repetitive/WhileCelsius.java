package repetitive;

import java.util.Locale;
import java.util.Scanner;

public class WhileCelsius {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        char resposta = 's';

        while ( resposta != 'n'){
            System.out.print("Digite a temperatura em Celsius: ");
            double C = scanner.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resposta = scanner.next().charAt(0);
        }

        scanner.close();
    }
}
