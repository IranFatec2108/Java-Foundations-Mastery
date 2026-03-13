package oop;
import oop.entities.ProductConstructor;
import java.util.Locale;
import java.util.Scanner;

public class MainProductConstructor {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();

        ProductConstructor product = new ProductConstructor(name, price);
        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice() );


        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.AddProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to removed from stock: ");
        quantity = scanner.nextInt();
        product.RemoveProducts(quantity);
        System.out.println();
        System.out.println("Updated data: " + product);


        scanner.close();
    }
}