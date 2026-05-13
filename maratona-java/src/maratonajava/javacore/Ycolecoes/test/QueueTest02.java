package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {

    public static void main(String[] args) {

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        mangas.add(new Manga(5L, "Bersek", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 9.5));
        mangas.add(new Manga(4L, "Attack on titan", 7.45));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 3.34));
        mangas.add(new Manga(2L, "Drago ball z", 2.99));
        mangas.add(new Manga(10L, "Aaragon", 2.99));

        while (!mangas.isEmpty()) {

            System.out.println(mangas.poll());
        }
    }
}
