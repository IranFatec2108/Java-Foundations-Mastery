package oop.entities;

//Criamos a classe Triangulo
public class Triangle {

    //definimos atributos e seus tipos
    public double a;
    public double b;
    public double c;

    //criamos uma função(metodo) para modularizar a logica da aplicação - os () vazios indicam que não precisamos de parametros externos, apenas os atributos da propria classe(a,b,c)
    public double area (){
        //definimos uma variavel para criamos o valor de p baseado nos atributos da propria classe
        double valueP = (a + b + c) / 2.0;
        //criamos o return para retornar a expressão, é mais fácil e evita criação desnecessaria de váriavies
        return Math.sqrt(valueP * (valueP - a) * (valueP - b) * (valueP - c));

    }
}
