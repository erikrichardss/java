package exercise.pacote02.ex27.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(15);
        numeros.add(20);
        numeros.add(25);
        numeros.add(30);

        Iterator<Integer> numerosIteretor = numeros.iterator();

        while (numerosIteretor.hasNext()) {

            if (numerosIteretor.next() %2 != 0) {

                numerosIteretor.remove();
            }
        }

        System.out.println(numeros);
    }
}
