package conditional;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números para saber se são multiplos entre si: " );

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();

        if(valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("São multiplos");
        }else{
            System.out.println("Não são multiplos");
        }

        scanner.close();
    }
}
