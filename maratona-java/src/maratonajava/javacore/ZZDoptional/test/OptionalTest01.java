package maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Aha uhu");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();

        Optional<String> nameOptional = (findName("William"));
        String nameString = nameOptional.orElse("EMPTY");
        System.out.println(nameString);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name) {

        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);

        if (i != 1) {

            return Optional.of(list.get(i));
        }

        return Optional.empty();
    }
}
