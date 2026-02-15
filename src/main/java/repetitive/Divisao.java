package repetitive;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

      int n = scanner.nextInt();

      for (int i = 0; i < n; i++) {
          int numeroA = scanner.nextInt();
          int numeroB = scanner.nextInt();

          if (numeroB == 0) {
              System.out.println("divisao impossivel");
          } else {

              double produto = (double) numeroA / numeroB;


              System.out.printf("%.1f%n", produto);
          }
      }
        scanner.close();
    }
}