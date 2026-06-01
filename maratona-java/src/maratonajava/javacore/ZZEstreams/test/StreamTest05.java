package maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {

    public static void main(String[] args) {

        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        Set<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toSet());
        Stream<String> stream = Arrays.stream(letters);

        Set<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toSet());

        System.out.println(letters2);
    }
}
