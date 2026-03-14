package exercise.pacote02.ex23.classe;

import exercise.pacote02.ex23.exception.CarrinhoVazioException;
import exercise.pacote02.ex23.exception.EstoqueInsuficienteException;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemCarrinho> itemCarrinhos = new ArrayList<>();

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto == null) {
            throw new IllegalArgumentException("Erro: não foi encontrado produtos");
        }

        if (quantidade <= 0 || quantidade > produto.getEstoque()) {
            throw new EstoqueInsuficienteException("Erro: estoque insuficiente");
        }

        ItemCarrinho itemCarrinho = new ItemCarrinho(produto, quantidade);
        this.itemCarrinhos.add(itemCarrinho);
        System.out.println(itemCarrinho.getProduto().getNome() + " adicionado");
    }

    public void removerProduto(int id) {
        if (this.itemCarrinhos == null) {
            throw new CarrinhoVazioException("Erro: carrinho vazio");
        }

        for (ItemCarrinho itemCarrinho : this.itemCarrinhos) {

            if (itemCarrinho.getProduto().getId() == id) {
                this.itemCarrinhos.remove(itemCarrinho);
                System.out.println(itemCarrinho.getProduto().getNome() + " removido");
            }
        }
    }

    public double calcularTotal() {
        if (getItemCarrinhos() == null) {
            throw new CarrinhoVazioException("Erro: Carrinho vazio");
        }

        double total = 0;

        for (ItemCarrinho itemCarrinho : this.itemCarrinhos) {

             total += itemCarrinho.calcularTotal();
        }

        return total;
    }

    public void finalizarCompra() {
        if (itemCarrinhos == null) {
            throw  new CarrinhoVazioException("Erro: carrinho vazio");
        }

        for (ItemCarrinho itemCarrinho : itemCarrinhos) {
            System.out.println("Produto: " + itemCarrinho.getProduto().getNome());
            System.out.println("Quantidade: " + itemCarrinho.getQuantidade());
            System.out.println("Total: R$" + itemCarrinho.calcularTotal());
            System.out.println();
        }

        System.out.println("Total: " + calcularTotal());
    }

    public List<ItemCarrinho> getItemCarrinhos() {
        return itemCarrinhos;
    }
}
