package exercise.pacote02.ex27.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaruSearch {

    public static void main(String[] args) {

        Integer[] numeros = {1, 3, 5, 7, 9, 11};

        List<Integer> numerosList = Arrays.asList(numeros);

        Collections.sort(numerosList);
        System.out.println(numerosList);

        System.out.println(Collections.binarySearch(numerosList, 8));
        System.out.println(Collections.binarySearch(numerosList, 11));
    }
}
