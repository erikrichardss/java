package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {

    public static void main(String[] args) {

        List<Manga> mangas = new LinkedList<>();

        mangas.add(new Manga(5L, "Bersek", 19.9, 0));
        mangas.add(new Manga(1L, "Pokemon", 9.5, 5));
        mangas.add(new Manga(4L, "Attack on titan", 7.45, 0));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 3.34, 2));
        mangas.add(new Manga(2L, "Drago ball z", 2.99, 0));

        Iterator<Manga> mangaIterator = mangas.iterator();

//        while (mangaIterator.hasNext()) {
//
//            if (mangaIterator.next().getQuantidade() == 0) {
//
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);
    }
}
