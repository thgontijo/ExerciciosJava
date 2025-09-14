package introducao.metodos.test;

import introducao.metodos.domain.Jogador;

public class JogadorTest {
    public static void main(String[]args){
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Ronaldo");
        Jogador[] jogadores = {jogador1, jogador2,jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }


    }
}
