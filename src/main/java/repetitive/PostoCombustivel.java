package repetitive;

import java.util.Scanner;

public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //produtos do posto, no caso tipos de combustivel
        int gasolina = 0;
        int alcool = 0;
        int diesel = 0;

        //criamos uma variavel tipo para inserirmos quais tipos de combustiveis queremos
        int tipo = scanner.nextInt();

        //enquanto tipo não for 4 o loop continuará
        while (tipo != 4){
            //caso 1 : alcool soma uma unidade toda vez que seu tipo é digitado
            if (tipo == 1) {
                alcool ++;
                //caso 2 : gasolina soma uma unidade toda vez que seu tipo é digitado

            } else if (tipo == 2) {
                gasolina ++;
                //caso 3 : diesel soma uma unidade toda vez que seu tipo é digitado

            } else if (tipo == 3) {
                diesel ++;
            } //caso não encaixe em um desses tipos, desconsidera o valor e volta a pedir dados de entrada pro usuario

            //garante que o valor sempre seja pedidio dentro do loop(até a digitação do 4)
            tipo = scanner.nextInt();
        }
        //imprime pro usuario os valores finais
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        scanner.close();
    }
}
