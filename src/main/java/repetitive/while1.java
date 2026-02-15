package repetitive;

import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        System.out.println("Digite um numero: ");

        int numEntranda = scanner.nextInt();
        int soma = 0;

        while (numEntranda != 0){
            soma += numEntranda;
            System.out.println("Escreva novamente: ");

            numEntranda = scanner.nextInt();
        }
        System.out.println("Valor final: " + soma);
        scanner.close();
    }
}
