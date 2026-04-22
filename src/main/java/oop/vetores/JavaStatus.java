package oop.vetores;

public class JavaStatus {
    public static void main(String[] args) {

        String logProva = "candidato:Thiago;NOTA:8.5;SITUACAO:Pendente";
        String [] gavetas = logProva.split(";");

        String pedaco = gavetas[1];
        String limpo = pedaco.replace("NOTA:" ,"");

        double numeroLimpo = Double.parseDouble(limpo);

        double NumeroFinal = numeroLimpo + 1.5;
        System.out.println(NumeroFinal);
    }
}
