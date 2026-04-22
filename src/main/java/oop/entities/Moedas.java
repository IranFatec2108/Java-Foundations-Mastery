package oop.entities;

public class Moedas {

    private String name;
    private double valor;

    public Moedas (String name, double valor){
        this.name = name;
        this.valor = valor;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return " Moedas disponiveis - "
                +"Nome: "
                + name
                + ", Valores: "
                + String.format("%.2f%n", valor);
    }
}
