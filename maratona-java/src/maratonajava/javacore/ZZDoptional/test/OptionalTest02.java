package maratonajava.javacore.ZZDoptional.test;

import maratonajava.javacore.ZZDoptional.doman.Manga;
import maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {

        Optional<Manga> byTitle = MangaRepository.findByTitle("Boku no Hero");
        byTitle.ifPresent(m -> m.setTitle(m.getTitle() + " 2"));

        System.out.println(byTitle);

        Optional<Manga> byId = MangaRepository.findById(2);
        byId.orElseThrow(IllegalArgumentException::new);

        System.out.println(byId);

        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));

        System.out.println(newManga);
    }
}
