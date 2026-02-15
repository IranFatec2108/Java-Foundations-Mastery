package conditional;

import java.util.Locale;
import java.util.Scanner;

public class Notas{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        double notaAluno1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        double notaAluno2 = scanner.nextDouble();

        double notaFinal = notaAluno1 + notaAluno2;

        if (notaFinal >= 60.0) {
            System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
            System.out.println("APROVADO");
        } else {
            System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
            System.out.println("REPROVADO");
        }

        scanner.close();
    }
}
