package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class precoTerreno  {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double largura, altura, area, preco, precoMetro;

        System.out.println("Digite a largura do terreno: ");
        largura = sc.nextDouble();
        System.out.println("Digite a altura do terreno: ");
        altura = sc.nextDouble();
        System.out.println("Digite o preço do metro quadrado: ");
        precoMetro = sc.nextDouble();

        area = largura * altura;
        preco = area * precoMetro;


        System.out.printf("Área do terreno é: %.2fm%n", area);
        System.out.printf("O preco do terreno é de: R$%.2f%n", preco);
        sc.close();

    }
}
