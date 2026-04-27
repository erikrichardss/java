package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

    public static void main(String[] args) {

        List<String> mangas = new ArrayList<>();

        mangas.add("Bersek");
        mangas.add("Pokemon");
        mangas.add("Attack on titan");
        mangas.add("Hellsing Ultimate");
        mangas.add("Drago ball z");

        Collections.sort(mangas);

        List<Double> dinheiro = new ArrayList<>();
        dinheiro.add(100.12);
        dinheiro.add(12.23);
        dinheiro.add(32D);
        dinheiro.add(21D);

        for (String manga : mangas) {

            System.out.println(manga);
        }

        System.out.println(dinheiro);
        Collections.sort(dinheiro);
        System.out.println(dinheiro);
    }
}
