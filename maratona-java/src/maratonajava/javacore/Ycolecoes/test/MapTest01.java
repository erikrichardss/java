package maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mouze", "Mouse");
        map.put("vc", "você");
        System.out.println(map);

        for (String key : map.keySet()) {

            System.out.println(key + " : " + map.get(key));
        }

        System.out.println("------------------------");

        for (String value : map.keySet()) {

            System.out.println(value);
        }

        System.out.println("------------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {

            System.out.println(entry + " - " + entry.getValue());
        }
    }
}
