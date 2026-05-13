package exercise.pacote02.ex27.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(6);
        numeros.add(4);
        numeros.add(9);
        numeros.add(2);

        System.out.println(numeros);

        Collections.sort(numeros);

        System.out.println(numeros);

        System.out.println(Collections.max(numeros));
        System.out.println(Collections.min(numeros));

    }
}
