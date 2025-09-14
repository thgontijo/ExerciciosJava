package introducao.metodos.test;

import introducao.metodos.domain.Jogador;
import introducao.metodos.domain.Time;

public class JogadorTest02 {
    public static void main(String[]args){
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Corinthians");

        jogador.setTime(time);
        jogador.imprime();
    }
}
