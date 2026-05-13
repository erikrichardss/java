package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {

    public static void main(String[] args) {

        Consumidor consumidor1 = new Consumidor("Erik");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga1 = new Manga(5L, "Bersek", 19.9);
        Manga manga2 = new Manga(1L, "Pokemon", 9.5);
        Manga manga3 = new Manga(4L, "Attack on titan", 7.45);
        Manga manga4 = new Manga(3L, "Hellsing Ultimate", 3.34);
        Manga manga5 = new Manga(2L, "Drago ball z", 2.99);

        List<Manga> mangaConsumidor1 = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsumidor2 = List.of(manga4, manga5);

        Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();

        consumidorManga.put(consumidor1, mangaConsumidor1);
        consumidorManga.put(consumidor2, mangaConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {

            System.out.println("--" + entry.getKey().getNome());

            for (Manga manga : entry.getValue()) {

                System.out.println("----" + manga.getNome());
            }

        }
    }
}
