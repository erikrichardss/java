package maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {

    public static void main(String[] args) {

        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = new ArrayList<>(List.of(
                "Wildnei", "Catarina Santos", "Sandy Candy"
        ));
        List<String> developers = new ArrayList<>(List.of(
                "William", "David", "Harisson"
        ));
        List<String> students = new ArrayList<>(List.of(
                "Édipo", "Gustavo", "Flávia", "Guilherme"
        ));
        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        devDojo.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
