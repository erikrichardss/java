package exercise.pacote02.ex14.classe;

public class Pedido {
    private Produto[] produtos;
    private int[] quantidades;
    private int totalItens;
    private boolean finalizado;

    public Pedido() {
        this.produtos = new Produto[5];
        this.quantidades = new int[5];
        this.totalItens++;
        this.finalizado = false;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (this.finalizado != false) {
            System.out.println("O pedido já foi finalizado!");
            return;
        }

        if (quantidade > produto.getQuantidadeEstoque()) {
            System.out.println("Estoque insuficiente");
            return;
        }

        produto.diminuirEstoque(quantidade);
    }

    public double calcularTotal() {
        double valorTotal = 0;

        for (int i = 0; i < this.totalItens; i++) {
            valorTotal = this.produtos[i].getPreco() * this.quantidades[i];
        }

        return valorTotal;
    }

    public void finalizarPedido() {
        this.finalizado = true;
    }

    public void exibirResumo() {
        for (Produto produto : this.produtos) {
            System.out.println("Produto: " + produto.getNome() +
                    ", quantidade: " + getQuantidades() +
                    ", " + calcularTotal());
        }
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public int[] getQuantidades() {
        return quantidades;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public boolean isFinalizado() {
        return finalizado;
    }
}
