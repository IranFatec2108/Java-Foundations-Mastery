package oop;

import oop.entities.Moedas;

import java.util.ArrayList;
import java.util.List;
public class TesteCarteira {
    public static void main(String[] args) {

        List<Moedas> moedas = new ArrayList<>();

        moedas.add(new Moedas("Bitcoin", 350000.00));
        moedas.add(new Moedas("ETH", 34000.00));
        moedas.add(new Moedas("Elix", 367.00));
        System.out.println(moedas);

        for (int i = 0; i < moedas.size(); i++) {
            Moedas moedaAtual = moedas.get(i);

            if (moedaAtual.getValor() > 10000.00) {
                System.out.println(moedaAtual.getName() + " é uma moeda de ALTO VALOR!");
            }
        }
    }
}
