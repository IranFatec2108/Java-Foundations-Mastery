package oop;

import oop.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        //Scanner para o usuario atribuir o valor e locale para usar ponto no double
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        //peço os valores e atribuo as variaveis
        System.out.println("Enter account number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter account holder: ");
        String holder = scanner.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);
        //crio o 0bjeto
        Account account;
        //condicional para resposta do usuario crio um construtor diferente
        if( response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double balance = scanner.nextDouble();
            account = new Account(number, holder, balance);
        } else {
             account = new Account(number, holder);
        }
        //informo o usuario os dados do objeto account
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();
        //uso o metodo setter para depositar o valor
        System.out.println("Enter a deposit value:");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data:");
        System.out.println(account);
        System.out.println();
        //uso o setter para sacar o valor
        System.out.println("Enter a withdraw value:");
        amount = scanner.nextDouble();
        account.withdraw(amount);
        //mostro o objeto com os dados finais
        System.out.println("Updated account data:");
        System.out.print(account);

        scanner.close();



    }
}
