package repetitive;

import java.util.Locale;
import java.util.Scanner;


public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();

                double MediaPonderada = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

                System.out.printf("%.1f%n", MediaPonderada);
            }

        }
        scanner.close();
    }
}

