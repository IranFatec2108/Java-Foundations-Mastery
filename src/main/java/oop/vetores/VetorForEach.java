package oop.vetores;

public class VetorForEach {
    public static void main(String[] args) {
        String [] vect = new String[] {"Maria", "João", "Pedro"};

        for (int i = 0; i < vect.length ; i++) {
            System.out.println(vect[i]);
        }

        for (String obj : vect){
            System.out.println(obj);
        }
    }

}
