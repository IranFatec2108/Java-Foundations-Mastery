package oop;

import oop.entities.Empregado;
import oop.entities.ProdutoVetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();

        List<Empregado> employee = new ArrayList<>(n);

        for (int i = 0; i < n ; i++) {
            System.out.println("Employee #" + i  + ":");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            employee.add(new Empregado(id, name, salary));
            }
        }

    }

