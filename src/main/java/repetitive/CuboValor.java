package repetitive;

import java.util.Scanner;

public class CuboValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {

            int CuboValor =  (i * i) * i;
            System.out.println(i + " " + (i * i) + " " + CuboValor);

        }
        scanner.close();
    }
}
