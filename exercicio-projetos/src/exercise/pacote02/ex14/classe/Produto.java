package exercise.pacote02.ex14.classe;

public class Produto {
    private String nome;
    protected double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void diminuirEstoque(int quantidade) {
        if (this.quantidadeEstoque > quantidade) {
            this.quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void almentarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

    public void exibirInformacaoProduto() {
        System.out.println("Nome: " + getNome() +
                ", preco: " + getPreco() +
                ", estoque: " + getQuantidadeEstoque());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
