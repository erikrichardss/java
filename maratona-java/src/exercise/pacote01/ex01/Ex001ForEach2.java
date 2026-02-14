package exercise.pacote01.ex01;

import java.util.HashMap;
import java.util.Map;

public class Ex001ForEach2 {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("Mouse", 39.90);
        products.put("Keyboard", 89.90);
        products.put("Phone", 59.90);
        products.put("WebCam", 129.90);

        for (String product : products.keySet()) {

            if (products.get(product) > 50) {
                System.out.println(product + " -> " + products.get(product));
            }

        }
    }
}
