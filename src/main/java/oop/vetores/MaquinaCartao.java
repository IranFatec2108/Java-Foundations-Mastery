package oop.vetores;

import java.util.Arrays;

public class MaquinaCartao {
    public static void main(String[] args) {
        String loteTransacoes = "150.50,45.00,300.00,20.75";
        double totalDoDia = 0.0;
        String [] somaValores = loteTransacoes.split(",");

        for (int i = 0; i <somaValores.length ; i++) {
            double valorReal = Double.parseDouble(somaValores[i]);
            totalDoDia += valorReal;
        }
        System.out.println(totalDoDia);
    }
}
