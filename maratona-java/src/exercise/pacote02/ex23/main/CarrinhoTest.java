package exercise.pacote02.ex23.main;

import exercise.pacote02.ex23.classe.Carrinho;
import exercise.pacote02.ex23.classe.ItemCarrinho;
import exercise.pacote02.ex23.classe.Produto;
import exercise.pacote02.ex23.exception.CarrinhoVazioException;
import exercise.pacote02.ex23.exception.EstoqueInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoTest {
    public static void main(String[] args) {
        Produto produtoUm = new Produto(86, "Teclado Mecânico", 390, 76);
        Produto produtoDois = new Produto(87, "Mouse", 190, 76);

        Carrinho carrinho = new Carrinho();

        try {

            carrinho.adicionarProduto(produtoUm, 4);
            carrinho.adicionarProduto(produtoDois, 3);
            carrinho.finalizarCompra();
        } catch (CarrinhoVazioException e) {

            e.printStackTrace();
        } catch (EstoqueInsuficienteException e) {

            e.printStackTrace();
        } finally {

            System.out.println("Finalizado");
        }
    }
}
