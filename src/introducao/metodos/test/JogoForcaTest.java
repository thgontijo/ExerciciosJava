package introducao.metodos.test;

import introducao.metodos.domain.JogoDaForca;

import java.util.Scanner;

public class JogoForcaTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        JogoDaForca jogo = new JogoDaForca();

        int qtdL;
        int qtdE = 0; // erros
        int qtdA = 0; // acertos
        boolean acabou = false;
        String[] letraNDescoberta;

        System.out.println("Digite a palavra do jogo: ");
        qtdL = jogo.setPalavra(entrada.nextLine());
        letraNDescoberta = new String[qtdL];

        for (int j = 0; j < qtdL; j++) {
            if (jogo.letras[j].equalsIgnoreCase(" ")) {
                letraNDescoberta[j] = " ";
            } else {
                letraNDescoberta[j] = "_";
            }
        }

        // "limpa" a tela
        for (int z = 0; z < 30; z++) {
            System.out.println(" ");
        }

        do {
            // mostra palavra até agora
            for (int i = 0; i < qtdL; i++) {
                System.out.print(letraNDescoberta[i] + " ");
            }
            System.out.println();
            System.out.println("Qtd de erros: " + qtdE);

            // tentativa
            System.out.println("Digite uma letra: ");
            jogo.tentativa = String.valueOf(entrada.nextLine().charAt(0));


            boolean acertou = false;

            for (int i = 0; i < qtdL; i++) {
                if (jogo.tentativa.equalsIgnoreCase(jogo.letras[i]) &&
                        letraNDescoberta[i].equals("_")) {
                    letraNDescoberta[i] = jogo.tentativa;
                    qtdA++;
                    acertou = true;
                }
            }

            if (!acertou) {
                qtdE++;
            }

            // verifica se acabou
            acabou = true;
            for (int r = 0; r < qtdL; r++) {
                if (letraNDescoberta[r].equalsIgnoreCase("_")) {
                    acabou = false;
                    break;
                }
            }
        } while (!acabou && qtdE < 6);

        for (int i = 0; i < qtdL; i++) {
            System.out.print(letraNDescoberta[i] + " ");
        }

        System.out.println(" ");

        if (acabou) {
            System.out.println("Parabéns!! Você acertou!");
        } else {
            System.out.println("Você perdeu! A palavra era: " + jogo.getPalavra());
        }
    }
}
