package sobrecargametodos.test;

import sobrecargametodos.domain.Anime;

import java.util.Scanner;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tipo do anime: ");
        anime.setTipo(entrada.nextLine());

        System.out.println("Digite a quantidade de episódios: ");
        anime.setEpisodios(entrada.nextInt());
        entrada.nextLine();
        System.out.println(anime.getTipo());
        System.out.println(anime.getEpisodios());
        entrada.close();
    }
}
