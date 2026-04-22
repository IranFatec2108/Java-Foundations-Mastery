package oop.vetores;

public class ExtratorPrecisao {

    public static void main(String[] args) {
        String log = "DATA:2024-04-13;TEMP:25.8;UMID:60";
        String [] infosLog = log.split(";");

        double numeroReal = 0;
        for (int i = 0; i <infosLog.length ; i++) {
            if (infosLog[i].contains("TEMP:")) {
                String limpo = infosLog[i].replace("TEMP:", "");

                numeroReal += Double.parseDouble(limpo);

            }

        }
        System.out.println("Numero real = " + numeroReal);
    }
}
