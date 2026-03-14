package exercise.projetos.proj4.domain;

import exercise.projetos.proj4.enums.TipoProduto;

public class Produto {
    private String nome;
    private double preco;
    private TipoProduto tipoProduto;

    public Produto(String nome, double preco, TipoProduto tipoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    public String getNome() { return this.nome; }

    public double getPreco() { return this.preco; }

    public TipoProduto getTipoProduto() { return this.tipoProduto; }
}
