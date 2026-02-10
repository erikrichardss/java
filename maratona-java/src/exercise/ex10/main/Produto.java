package exercise.ex10.main;

import exercise.ex10.classe.ProdutoClasse;

public class Produto {
    public static void main(String[] args) {
        ProdutoClasse produto = new ProdutoClasse("Teclado");

        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
    }
}
