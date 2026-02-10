package exercise.ex10.classe;

public class ProdutoClasse {
    private String nome;
    private double preco;

    public ProdutoClasse(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoClasse(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }
}
