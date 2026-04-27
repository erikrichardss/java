package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {

    public static void main(String[] args) {

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "Bersek", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 9.5));
        mangas.add(new Manga(4L, "Attack on titan", 7.45));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 3.34));
        mangas.add(new Manga(2L, "Drago ball z", 2.99));

//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);

        for (Manga manga : mangas) {

            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Drago ball z", 2.99);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
