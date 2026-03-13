package conditional;

import java.util.Scanner;

public class DuracaoHora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" escreva o inicio e termino do jogo em horas: ");

        int horaInicio = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;

        if (horaInicio < horaFinal){
            duracao = horaFinal - horaInicio;
        } else if (horaInicio > horaFinal) {
            duracao = (24 - horaFinal) + horaInicio;
        }else {
            duracao = 24;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        scanner.close();
    }
}
