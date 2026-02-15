package conditional;

import java.util.Scanner;

public class menorNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva oS valores para descobrir o menor:");
        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        int menorNumero = Math.min(valor1, Math.min(valor2, valor3));

        if (valor1 == valor2 && valor2 == valor3){
        System.out.println("MENOR = " + valor1);
            }else {
            System.out.println("MENOR = " + menorNumero );
        }

        scanner.close();
    }
}
