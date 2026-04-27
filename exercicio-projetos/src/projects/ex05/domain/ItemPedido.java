package projects.ex05.domain;

import java.util.Objects;

public class ItemPedido {

    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {

        this.produto = produto;

        if (quantidade > produto.getEstoque()) {

            throw new IllegalArgumentException("Estoque insuficiente");
        }

        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return Objects.equals(produto, that.produto);
    }

    @Override
    public int hashCode() {

        return Objects.hashCode(produto);
    }

    @Override
    public String toString() {

        return "ItemPedido{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                '}';
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
