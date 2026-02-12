package maratonajava.javacore.Eblocosdeinicializacao.test;

import maratonajava.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.println(episodio + " ");
        }
    }
}
