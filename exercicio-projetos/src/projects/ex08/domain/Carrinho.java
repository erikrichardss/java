package projects.ex08.domain;

import exercise.pacote02.ex23.exception.CarrinhoVazioException;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<ItemCarrinho> itemCarrinhos = new ArrayList<>();

    public boolean adicionarProduto(ItemCarrinho itemCarrinho) {

        return itemCarrinhos.add(itemCarrinho);
    }

    public boolean removerProduto(ItemCarrinho itemCarrinho) {

        return itemCarrinhos.remove(itemCarrinho);
    }

    public void limparCarrinho() {

        itemCarrinhos.clear();
    }

    public double calcularTotal() {

        if (itemCarrinhos.isEmpty()) {

            throw new CarrinhoVazioException("Carrinho vazio!");
        }

        double precoTotal = 0;

        for (ItemCarrinho itemCarrinho : itemCarrinhos) {

            precoTotal += itemCarrinho.getProduto().getPreco() * itemCarrinho.getQuantidade();
        }

        return precoTotal;
    }

    public void listarItens() {

        for (ItemCarrinho itemCarrinho : itemCarrinhos) {

            System.out.println(itemCarrinho.toString());
        }
    }

    public List<ItemCarrinho> getItemCarrinhos() {
        return itemCarrinhos;
    }
}
