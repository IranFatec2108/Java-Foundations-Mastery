package oop.vetores;



public class FiltroRuido {
    public static void main(String[] args) {
        String sinal = "status:active;valor:10.5";
        if (sinal.contains("active")){
            System.out.println("Processando");

        }else{
            System.out.println( "Inactive");
        }

    }
}
