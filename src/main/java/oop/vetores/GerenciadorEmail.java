package oop.vetores;

public class GerenciadorEmail {
    public static void main(String[] args) {
        String nomeNovoFuncionario = "Iran Silva";
        String [] nomeEspaco = nomeNovoFuncionario.split(" ");
        String nomeJunto = nomeEspaco[0] + "." + nomeEspaco[1] + "@empresa.com.br";
        String email = nomeJunto.toLowerCase();


        System.out.println(email);

    }
}
