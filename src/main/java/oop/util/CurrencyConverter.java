package oop.util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double converter(double cotacao, double quantidade) {

        double valorBruto = cotacao * quantidade;
        return valorBruto + (valorBruto * IOF);
    }
}