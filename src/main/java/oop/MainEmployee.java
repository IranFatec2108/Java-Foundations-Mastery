package oop;
import oop.entities.Employee;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);

        Employee funcionario = new Employee();
        System.out.print("Name: ");
        funcionario.name = scanner.nextLine();
        System.out.print("Gross salary: ");
        funcionario.grossSalary = scanner.nextDouble();
        System.out.print("Tax: ");
        funcionario.tax = scanner.nextDouble();

        System.out.println();
        System.out.print("Employee: " + funcionario);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = scanner.nextDouble();
        funcionario.increaseSalary(percentage);
        System.out.println();
        System.out.print("Update data: " + funcionario);

        scanner.close();
    }
}