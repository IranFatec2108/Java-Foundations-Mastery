package repetitive;

import java.util.Scanner;

public class validaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha: ");

        int senhaEntrada = scanner.nextInt();

        while(senhaEntrada != 2002){
            System.out.println("Senha invalida");
            senhaEntrada = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");
        scanner.close();
    }
}
