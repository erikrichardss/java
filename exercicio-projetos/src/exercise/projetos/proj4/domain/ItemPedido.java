package exercise.projetos.proj4.domain;

import exercise.projetos.proj4.interfaces.Calculavel;

public class ItemPedido implements Calculavel {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    @Override
    public double calcularTotal() {
        return produto.getPreco() * getQuantidade();
    }

    public Produto getProduto() { return produto; }

    public int getQuantidade() { return quantidade; }
}
