package conditional;

import java.util.Scanner;

public class Intervalo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva um valor para saber em qual dos seguintes intervalos ele está: ");

        double numero = scanner.nextDouble();



        if (numero < 0 || numero > 100) {
            System.out.println("Fora de intervalo");
        } else if (numero <= 25) {
            System.out.println("src.conditional.Intervalo [0,25]");
        } else if (numero <= 50) {
            System.out.println("src.conditional.Intervalo (25,50]");
        } else if (numero <= 75) {
            System.out.println("src.conditional.Intervalo (50,75]");
        } else {
            System.out.println("src.conditional.Intervalo (75,100]");
        }

        scanner.close();

    }
}
