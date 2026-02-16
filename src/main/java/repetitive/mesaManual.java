package repetitive;

public class MesaManual {
    public static void main(String[] args) {
                // ex1();
                // ex2();
                // ex3();
                // ex4();
                // ex5();
                // ex6();
            }

            static void ex1() {
                int x = 5;
                int y = 0;

                while (x > 2) {
                    System.out.print(x);
                    y = y + x;
                    x = x - 1;
                }

                System.out.println();
                System.out.println("x final = " + x);
                System.out.println("y final = " + y);
            }

            static void ex2() {
                int x = 2;
                int y = 0;

                while (x < 60) {
                    System.out.println(x);
                    x = x * 2;
                    y = y + 10;
                }

                System.out.println("x final = " + x);
                System.out.println("y final = " + y);
            }

            static void ex3() {
                double x = 100;
                double y = 100;

                while (x != y) {
                    System.out.print("olha");
                    x = Math.sqrt(y);
                }

                System.out.println();
                System.out.println("x final = " + x);
                System.out.println("y final = " + y);
            }

            static void ex4() {
                int x = 0;
                int y;

                while (x < 5) {
                    y = x * 3;
                    System.out.print(y);
                    x = x + 1;
                }

                System.out.println("Fim");
            }

            static void ex5() {
                int x = 2;
                int y = 10;

                System.out.println("Olá");
                while (x < y) {
                    System.out.println(x + "-" + y);
                    x = x * 2;
                    y = y + 1;
                }

                System.out.println("x final = " + x);
                System.out.println("y final = " + y);
            }

            static void ex6() {
                int x = 4;
                int y = 0;
                int i = 0;

                while (i < x) {
                    i = i + 1;
                    y = y + i;
                    System.out.print(i);
                    System.out.println(y);
                }

                System.out.println("x final = " + x);
                System.out.println("i final = " + i);
                System.out.println("y final = " + y);
            }
        }


