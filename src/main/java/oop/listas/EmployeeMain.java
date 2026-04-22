package oop.listas;

import oop.entities.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Empregado> list = new ArrayList<>();
        System.out.println("How many employees will be registered?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id:");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name:");
            String name = scanner.nextLine();
            System.out.print("Salary:");
            double salary = scanner.nextDouble();
            Empregado funcionario = new Empregado(id, name, salary);
            list.add(funcionario);
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int idDigitado = scanner.nextInt();
        boolean funcionarioExistente = false;
        for (int i = 0; i < list.size() ; i++) {
            Empregado emp = list.get(i);
            if(idDigitado == emp.getId()){

                double percentage;
                System.out.println("Enter the percentage");
                percentage = scanner.nextDouble();
                emp.increaseSalary(percentage);
                funcionarioExistente = true;
                break;
            }
        }
        if (!funcionarioExistente){
            System.out.println("This id does not exist!");
        }
        System.out.println("List of employees:");
        for (Empregado emp : list) {
            System.out.println(emp);
        }
        
    }
}
