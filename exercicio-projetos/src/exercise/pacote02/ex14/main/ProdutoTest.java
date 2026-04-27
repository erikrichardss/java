package exercise.pacote02.ex14.main;

import exercise.pacote02.ex14.classe.Cliente;
import exercise.pacote02.ex14.classe.Pedido;
import exercise.pacote02.ex14.classe.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Teclado Mecânico", 250, 54);
        Produto produto2 = new Produto("Mouse gamer", 150, 28);
        Produto produto3 = new Produto("Headset", 120, 98);
        Pedido pedido = new Pedido();
        Cliente cliente = new Cliente();

        pedido.adicionarProduto(produto1, 20);
        pedido.adicionarProduto(produto2, 20);
        pedido.adicionarProduto(produto3, 20);
        pedido.finalizarPedido();
        produto1.exibirInformacaoProduto();

        cliente.criarPedido(pedido);

        pedido.exibirResumo();
    }
}
