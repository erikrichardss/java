package exercise.projetos.proj1.servico;

public class ItemPedido {
    private Produto produto;
    private static int quantidadeProduto;

    public ItemPedido(Produto produto) {
        this.produto = produto;
        ItemPedido.quantidadeProduto++;
    }

    public Produto getProduto() {
        return produto;
    }

    public static int getQuantidadeProduto() {
        return quantidadeProduto;
    }
}
