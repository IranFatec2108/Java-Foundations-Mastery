package conditional;

import java.util.Scanner;

public class Cardapio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de um item e a quantidade desse item do Carpadio: ");

        int codigoPedido = scanner.nextInt();
        int quantidadePedido = scanner.nextInt();
        double precoPedido;

        if (codigoPedido == 1 ){
            precoPedido = quantidadePedido * 4.00;
        }
        else if (codigoPedido == 2){
            precoPedido = quantidadePedido * 4.50;
        }
        else if (codigoPedido == 3){
            precoPedido = quantidadePedido * 5.00;
        }
        else if(codigoPedido == 4){
            precoPedido = quantidadePedido * 2.00;
        }
        else {
            precoPedido = quantidadePedido * 1.50;
        }

        System.out.printf("total : R$ %.2f%n", precoPedido);
        scanner.close();
    }
}
