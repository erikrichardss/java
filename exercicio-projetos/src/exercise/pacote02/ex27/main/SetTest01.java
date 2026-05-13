package exercise.pacote02.ex27.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {

    public static void main(String[] args) {

        List<String> nome = new ArrayList<>();
        nome.add("Ana");
        nome.add("João");
        nome.add("Ana");
        nome.add("Carlos");
        nome.add("João");
        nome.add("Maria");

        System.out.println(nome);

        Set<String> nomeSet = new HashSet<>();
        nomeSet.addAll(nome);

        List<String> nomesList = new ArrayList<>();
        nomesList.addAll(nomeSet);

        System.out.println(nomesList);
    }
}
