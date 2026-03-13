package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite o número do funcionário, suas horas trabalhadas e o valor recebido por horas trabalhadas(na sequência): ");

        int numeroFuncionario, horasTrabalhadas;
        double valorHoraTrab, salario;

        numeroFuncionario = scanner.nextInt();
        horasTrabalhadas = scanner.nextInt();
        valorHoraTrab = scanner.nextDouble();
        salario = horasTrabalhadas * valorHoraTrab;


        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scanner.close();


    }
}
