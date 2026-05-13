package exercise.pacote02.ex27.main;

import java.util.HashMap;
import java.util.Map;

public class AgendaTelefonicaTest01 {

    public static void main(String[] args) {

        Map<String, String> agenda = new HashMap<>();

        agenda.putIfAbsent("Maria", "23232323");
        agenda.putIfAbsent("Lucas", "12121212");
        agenda.putIfAbsent("Karla", "12341241");
        agenda.putIfAbsent("Karla", "12341241");

        agenda.remove("Lucas");

        for (Map.Entry<String, String> entry : agenda.entrySet()) {

            System.out.println(entry);
        }
    }
}
