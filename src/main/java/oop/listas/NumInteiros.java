package oop.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumInteiros {
    public static void main(String[] args) {
         List <String> list = new ArrayList<>();

         list.add("July");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Loke");

        for(String obj : list){
            System.out.println(obj);
        }
        System.out.println(list.size());

        list.remove("Loke");
        for(String obj : list){
            System.out.println(obj);
        }

        System.out.println("==================================");
        list.removeIf(x -> x.charAt(0)== 'A');

        for(String obj : list){
            System.out.println(obj);
        }

         
    }
}
