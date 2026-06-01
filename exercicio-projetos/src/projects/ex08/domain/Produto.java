package projects.ex08.domain;

import projects.ex08.enums.Categoria;

import java.util.Objects;

public class Produto extends Pedido {

    private Integer idCounter = 0;
    private Integer id;
    private String nome;
    private double preco;
    private Categoria categoria;
    private int estoque;

    public Produto(String nome, double preco, Categoria categoria, int estoque) {

        idCounter++;
        this.id = idCounter;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.estoque = estoque;
    }

    public int atualizarEstoque(int estoque) {

        return this.estoque += estoque;
    }

    public int removerEstoque(int estoque) {

        return this.estoque -= estoque;
    }

    public double atualizarPreco(double preco) {

        return this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(preco, produto.preco) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getEstoque() {
        return estoque;
    }
}
