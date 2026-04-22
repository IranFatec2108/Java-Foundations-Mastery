package oop.vetores;

public class MediaPreco {
    public static void main(String[] args) {

        double[] precos = {15.50, 40.0, 10.0, 25.50};

        double soma = 0;

        for (int i = 0; i < precos.length ; i++) {
            soma += precos[i];

        }
        double avg = soma / precos.length;
        System.out.printf("Média dos valores: %.2f%n", avg);
    }
}
