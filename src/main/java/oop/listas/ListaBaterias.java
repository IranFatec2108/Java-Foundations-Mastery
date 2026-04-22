package oop.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaBaterias {

    public static void main(String[] args) {
        //dados vindo de um sistem IOT
     String [] dadosBrutos = {"BAT:90", "BAT:12", "BAT:5", "BAT:45", "BAT:8"};

     //iniciamos a instanciação do nosso arraylist
     List<Integer> niveisBateria = new ArrayList<>();

     //percorremos o dado bruto para separar o texto do numero e converter o tipo
     for (int i = 0; i < dadosBrutos.length; i++){
         String limpo = dadosBrutos[i].replace("BAT:", "");
         int valor = Integer.parseInt(limpo);

         //damos ao arraylist os valores inteiros que foram limpos
         niveisBateria.add(valor);
     }
     //iniciamos a variavel que conta quantos sensores estão em risco
     int sensoresEmRisco= 0;

     //fazemos o loop com (size) ao inves do lenght para o arraylist, com a condição if, utilizando get para trazer esses valores do vetor para a gente, e falamos que caso a bateria esteja em um nivel menor que 10, contabilizamos o risco
     for (int i = 0; i < niveisBateria.size(); i++) {
         if (niveisBateria.get(i) < 10) {
             sensoresEmRisco++;
         }
     }
     //imprimimos, o array e os sensores de risco, arraylsit sempre precisa do metodo size para mostrar o tamanho do seu indice
        System.out.println("Total de baterias processadas: " + niveisBateria.size());
        System.out.println("Sensores em estado crítico: " + sensoresEmRisco);
    }
}
