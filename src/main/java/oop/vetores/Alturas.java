package oop.vetores;

import oop.entities.Pessoas;
import oop.entities.ProdutoVetor;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = scanner.nextInt();

        Pessoas[] vect = new Pessoas[n];

        for(int i = 0; i < vect.length; i++){
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
             scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Idade: ");
            int age = scanner.nextInt();
            System.out.print("Altura: ");
            double height = scanner.nextDouble();
            vect[i] = new Pessoas(name, age, height);
        }

        double sum = 0.0;

        for(int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
        }


        double avg = sum / vect.length;
        System.out.printf("Altura média: %.2f%n", avg);

        int percent = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i].getAge() < 16){
                percent++;
            }
        }

        double percentMenores = ((double) percent / vect.length) * 100.0;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n" , percentMenores );

        for (int i = 0; i < vect.length; i++) {
            if(vect[i].getAge() < 16)
                System.out.println(vect[i].getName());
        }


        scanner.close();
    }
}
