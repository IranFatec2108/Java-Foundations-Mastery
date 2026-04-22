package oop.listas;
import java.util.ArrayList;
import java.util.List;

public class Temperaturas {
    public static void main(String[] args) {

        List<Integer> temperaturas = new ArrayList<>();

        temperaturas.add(30);
        temperaturas.add(25);
        temperaturas.add(26);
        temperaturas.add(32);
        temperaturas.add(19);

        int maior = temperaturas.get(0);

        for (int i = 0; i < temperaturas.size() ; i++) {
            if(temperaturas.get(i) > maior){
                maior = temperaturas.get(i);
            }

        }
        System.out.println("Maior temperatura: " + maior);
    }
}
