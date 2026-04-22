package oop.vetores;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = scanner.nextLine();
        String invertida= "";

        for (int i = palavra.length() - 1 ; 0 <= i ; i--) {
            invertida += palavra.charAt(i);
        }
            if(palavra.equals(invertida)){
                System.out.println("é um palindromo");
            }else{
                System.out.println("não é um palindromo");
            }

        System.out.println("Palavra invertida: " + invertida);
        scanner.close();
    }
}
