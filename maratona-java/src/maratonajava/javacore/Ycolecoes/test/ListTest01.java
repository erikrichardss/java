package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();
        nomes.add("Erik");
        nomes.add("DevErik");
        nomes2.add("William");
        nomes2.add("DevDojo");


        nomes.addAll(nomes2);

        for (String nome : nomes) {

            System.out.println(nome);
        }

        nomes.add("Richard");
        System.out.println("---------------------");

        for (int i = 0; i < nomes.size(); i++) {

            System.out.println(nomes.get(i));
        }

        List<Integer> numero = new ArrayList<>();
        numero.add(1);

        String numeroString = "1";
        Integer numero2 = Integer.parseInt(numeroString);
        System.out.println(numero2);
        int i = numero2;
        System.out.println(i);

    }
}
