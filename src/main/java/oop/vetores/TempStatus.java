package oop.vetores;

public class TempStatus {
    public static void main(String[] args) {

        String logSensor = "ID:4092;TEMP:35.5;STATUS:OK";

        String [] gavetas = logSensor.split(";");
        String pedaço = gavetas[1];

        String limpo = pedaço.replace("TEMP:", "");
        double numero = Double.parseDouble(limpo);

        double numeroEmAlerta = numero + (numero * 0.10);
    }
}
