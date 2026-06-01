package maratonajava.javacore.ZZClambidas.test;

import maratonajava.javacore.ZZClambidas.dominio.Anime;
import maratonajava.javacore.ZZClambidas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {

    public static void main(String[] args) {

        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(
                new Anime("Bersek", 43),
                new Anime("One Piece", 900),
                new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);

        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (
                title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;

        System.out.println(animeBiFunction2.apply("Super Campeões", 36));
    }
}
