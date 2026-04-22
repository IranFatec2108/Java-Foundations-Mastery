package oop.vetores;

public class RelatórioRH {
    public static void main(String[] args) {
        String ficha = "MATRICULA:884;NOME:Ana Costa;CARGO:Dev;SALARIO:4500.50";
        String [] fichaFragmento = ficha.split(";");
        String funcionario = fichaFragmento[1].replace("NOME:", "");

        String salario = fichaFragmento[3];
        String salarioNumero = salario.replace("SALARIO:", "");
        double salarioReal = Double.parseDouble(salarioNumero);

        double aumento = salarioReal + (salarioReal * 0.15);

        System.out.println("A funcionária " + funcionario + " passará a ganhar : " + aumento);
    }
}
