package projects.ex08.domain;

public class ItemCarrinho {

    private Produto produto;
    private int quantidade;

    public void adicionarItemCarrinho(Produto produto, int quantidade) {

        if (quantidade <= 0 || produto.getEstoque() < quantidade) {

            throw new IllegalArgumentException("Quantidade inválida");
        }

        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {

        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return "ItemCarrinho{" +
                "produto=" + produto.toString() +
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
