package repetitive;

import java.util.Scanner;

public class Cartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // insere os valores de entrada nas variaveis
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //define que enquanto x ou y for diferente de 0 o programa vai continuar rodando
        while(x != 0 && y != 0){

          if( x > 0 && y > 0){
              System.out.println("primeiro");


          }
          else if(x < 0 && y < 0){
              System.out.println("terceiro");

          }
          else if ( x < 0 && y > 0){
                System.out.println("segundo");

            }
          //define que dentro do while se não corresponder a nenhum if/else anterior, imprimira quarto de x ser positivo e y negativo
          else{
              System.out.println("quarto");

          }
            //pede os valores novamente para continuar o loop
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        scanner.close();

    }
}
