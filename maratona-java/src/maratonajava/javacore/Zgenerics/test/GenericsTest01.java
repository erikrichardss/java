package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Anime");
        list.add("Anime");

        for (String string : list) {

            System.out.println(list);
        }

        add(list, new Consumidor("Anime"));

        for (Object o : list) {

            System.out.println(o);
        }
    }

    private static void add(List list, Consumidor consumidor) {

        list.add(consumidor);
    }
}
