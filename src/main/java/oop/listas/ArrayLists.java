package oop.listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        System.out.println("Digite o nome do carro que deseja buscar: ");
        String buscarCarro = scanner.nextLine();

        List<String> listCarro = new ArrayList<>() ;
        listCarro.add("Corolla");
        listCarro.add("Fiesta");
        listCarro.add("HB20");
        listCarro.add("Ferrari");


        if ( listCarro.contains(buscarCarro) == true){
            System.out.println("Temos o carro!");
        }else{
            System.out.println("Não temos o carro!");
        }

        scanner.close();
    }
}
