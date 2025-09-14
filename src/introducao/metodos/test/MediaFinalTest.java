package introducao.metodos.test;

import introducao.metodos.domain.MediaFinal;

import java.util.Scanner;

public class MediaFinalTest {
    public static void main(String[]args){
        MediaFinal media = new MediaFinal();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        media.setNomeAluno(entrada.nextLine());

        System.out.println("Qual sua nota peso sete? ");
        media.setPesoSete(entrada.nextDouble());
        entrada.nextLine();

        System.out.println("Qual sua nota peso nove?");
        media.setPesoNove(entrada.nextDouble());
        entrada.nextLine();

        System.out.println("Nota atitudinal?");
        media.setAtitudinal(entrada.nextDouble());
        entrada.nextLine();

        System.out.println("-------------------------");

        media.mediaFinal(media.getPesoSete(), media.getPesoNove(), media.getAtitudinal());

        media.imprime();

        entrada.close();
    }
}
