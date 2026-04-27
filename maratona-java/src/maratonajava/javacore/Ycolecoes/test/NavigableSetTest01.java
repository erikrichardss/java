package maratonajava.javacore.Ycolecoes.test;

import maratonajava.javacore.Ycolecoes.dominio.Manga;
import maratonajava.javacore.Ycolecoes.dominio.Samrphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartPhoneMarcaComparetor implements Comparator<Samrphone> {


    @Override
    public int compare(Samrphone o1, Samrphone o2) {

        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {

        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {

    public static void main(String[] args) {

        NavigableSet<Samrphone> set = new TreeSet<>(new SmartPhoneMarcaComparetor());

        Samrphone smartphone = new Samrphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(5L, "Bersek", 19.9));
        mangas.add(new Manga(1L, "Pokemon", 9.5));
        mangas.add(new Manga(4L, "Attack on titan", 7.45));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 3.34));
        mangas.add(new Manga(2L, "Drago ball z", 2.99));
        mangas.add(new Manga(10L, "Aaragon", 2.99));

        Manga yuyu = new Manga(21L, "yuyu Hakushy", 3.2);
        for (Manga manga : mangas.descendingSet()) {
            System.out.println(manga);
        }

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("----------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println("_---------------");
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
