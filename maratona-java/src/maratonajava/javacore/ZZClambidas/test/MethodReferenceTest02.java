package maratonajava.javacore.ZZClambidas.test;

import maratonajava.javacore.ZZClambidas.dominio.Anime;
import maratonajava.javacore.ZZClambidas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {

    public static void main(String[] args) {

        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Bersek", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);
        animeList.sort((a1, a2) -> animeComparators.compareByEpisodesNoStatic(a1, a2));
        System.out.println(animeList);
    }
}
