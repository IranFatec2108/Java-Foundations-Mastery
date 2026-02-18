package oop;
import oop.entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class AlunoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();
        aluno.name = scanner.nextLine();
        aluno.nota1 = scanner.nextDouble();
        aluno.nota2 = scanner.nextDouble();
        aluno.nota3 = scanner.nextDouble();

        System.out.println(aluno);

        scanner.close();

    }
}
