package fundamentals;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * raio * raio;
     
        System.out.printf("A=%.4f%n", area);
        sc.close();
    }
}
