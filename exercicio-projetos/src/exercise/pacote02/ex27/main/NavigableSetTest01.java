package exercise.pacote02.ex27.main;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest01 {

    public static void main(String[] args) {

        NavigableSet<Integer> numeros = new TreeSet<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
        numeros.add(7);
        numeros.add(6);
        numeros.add(4);
        numeros.add(9);

        System.out.println(numeros.first());
        System.out.println(numeros.last());
        System.out.println(numeros.ceiling(5));
        System.out.println(numeros.lower(5));
        numeros.removeIf(n -> n < 5);
        System.out.println(numeros);

    }
}
