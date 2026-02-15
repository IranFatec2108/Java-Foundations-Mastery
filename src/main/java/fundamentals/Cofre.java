package fundamentals;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cofre {
    public static void main(String[] args) {

        final int CENTAVOS_POR_REAL =  100;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o valor em moedas que você possue: ");

        int totalMoedas = scanner.nextInt();

        int reais = totalMoedas / CENTAVOS_POR_REAL;

        int centavos = totalMoedas % CENTAVOS_POR_REAL;

        System.out.println("Você possui: R$ " + reais + " E " + centavos + " centavos");

        scanner.close();
        }
    }
