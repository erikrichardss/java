package exercise.pacote02.ex24.main;

import exercise.pacote02.ex24.classe.Produto;
import exercise.pacote02.ex24.classe.ProdutoService;

public class ProdutoTest {
    public static void main(String[] args) {
        ProdutoService produtoService = new ProdutoService();

        produtoService.carregarProdutos("Notebook");
    }
}
