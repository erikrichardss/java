package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {

        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        mangas.add(new Manga(5L, "Bersek", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 9.5));
        mangas.add(new Manga(4L, "Attack on titan", 7.45));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 3.34));
        mangas.add(new Manga(2L, "Drago ball z", 2.99));

        for (Manga manga : mangas) {

            System.out.println(manga);
        }

        System.out.println("---------------");
        Collections.sort(mangas);

        for (Manga manga : mangas) {

            System.out.println(manga);
        }

        System.out.println("---------------");
//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());

        for (Manga manga : mangas) {

            System.out.println(manga);
        }
    }
}
