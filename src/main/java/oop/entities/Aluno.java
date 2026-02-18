package oop.entities;

public class Aluno {

    public String name;
    public double nota1;
    public double nota2;
    public double nota3;


   public double SomaNota(){
       return nota1 + nota2 + nota3;
    }
    public double PontosFaltantes(){
       if (SomaNota() < 60.0){
           return 60.0 - SomaNota();
       } else {
           return 0.0;
       }
    }

    public String toString(){
       if (SomaNota() >= 60.0){
           return "FINAL GRADE = "
                   + String.format("%.2f%n", SomaNota())
                   + "PASS";
       } else {
           return "FINAL GRADE = "
                   + String.format("%.2f%n", SomaNota())
                   + "FAILED"
                   +System.lineSeparator()
                   + "MISSING "
                   + String.format("%.2f", PontosFaltantes())
                   +" POINTS";

       }

    }
}
