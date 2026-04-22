package oop.listas;
import java.util.ArrayList;
import java.util.List;


public class Tarefa {
    public static void main(String[] args) {


        List< String> tarefas = new ArrayList<>();

        tarefas.add("Acordar");
        tarefas.add("Escovar dentes");
        tarefas.add("Alimentar pets");
        tarefas.add("Tomar banho");
        tarefas.add("Tomar café");

        System.out.println(tarefas.size());
        tarefas.remove(2);
        System.out.println( tarefas.size());


    }
}
