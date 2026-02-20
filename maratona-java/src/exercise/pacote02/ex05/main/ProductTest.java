package exercise.pacote02.ex05.main;

import exercise.pacote02.ex05.classe.Product;

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("12-3421", "Mouse");
        Product product2 = new Product("124-87", "Teclado");

        System.out.println(product.getID());
        System.out.println(product2.getID());
    }
}
