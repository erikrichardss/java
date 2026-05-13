package exercise.pacote02.ex27.main;

import exercise.pacote02.ex27.classe.Produto;

public class MapTest01 {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Tablet", 400);
        Produto produto2 = new Produto("Tablet", 400);
        Produto produto3 = new Produto("Celular", 700);

        System.out.println(produto1.equals(produto3));
        System.out.println(produto1.equals(produto2));
        System.out.println(produto1.hashCode());
    }
}
