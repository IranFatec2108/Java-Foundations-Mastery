package oop.vetores;

public class Agregador {
    public static void main(String[] args) {
        String[] baterias = {"BAT:90", "BAT:12", "BAT:5", "BAT:45"};

      int sensoresEmRisco = 0;
        for (int i = 0; i < baterias.length ; i++) {
            String limpo = baterias[i].replace("BAT:", "");
            int nivelBateria = Integer.parseInt(limpo);

            if (nivelBateria < 10){
                sensoresEmRisco++;
            }


        }
        System.out.println("Alerta: " + sensoresEmRisco + " sensores precisam de troca.");
   }
}
