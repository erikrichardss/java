package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {

    public static void main(String[] args) {

        Set<Manga> mangas = new LinkedHashSet<>( );

        mangas.add(new Manga(5L, "Bersek", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 9.5, 5));
        mangas.add(new Manga(4L, "Attack on titan", 7.45, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 3.34, 2));
        mangas.add(new Manga(2L, "Drago ball z", 2.99, 0));

        for (Manga manga : mangas) {

            System.out.println(manga);
        }

    }
}
