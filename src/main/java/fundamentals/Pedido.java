package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Pedido {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

     Scanner scanner = new Scanner (System.in);

        System.out.println("Escreva o código da peça, quantidade de peças  desejadas e o valor unitário  dessa peça(em sequência) depois escreva novamente na mesma ordem para o segundo pedido: ");
        int codigoPeca1, quantidadePeca1, codigoPeca2, quantidadePeca2;
        double valorUnit1, valorUnit2, total ;

        codigoPeca1 = scanner.nextInt();
        quantidadePeca1 = scanner.nextInt();
        valorUnit1 = scanner.nextDouble();

        codigoPeca2 = scanner.nextInt();
        quantidadePeca2 = scanner.nextInt();
        valorUnit2 = scanner.nextDouble();

        total = quantidadePeca1 * valorUnit1 + quantidadePeca2 * valorUnit2;

        System.out.printf("VALOR TOTAL A PAGAR: R$ %.2f%n", total);
     scanner.close();
    }
}
