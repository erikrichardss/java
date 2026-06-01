package projects.ex08.domain;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {

    private List<Produto> produtos = new ArrayList<>();

    public Vendedor(String nome, String email, List<Produto> produtos) {

        super(nome, email);
        this.produtos = produtos;
    }

    public boolean adicionarProduto(Produto produto) {

        return produtos.add(produto);
    }

    public boolean removerProduto(Produto produto) {

        return produtos.remove(produto);
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + this.getId() +
                ", nome=" + this.getNome() +
                ", tipo usuario=" + this.getTipoUsuario() +
                "produtos=" + produtos.toString() +
                '}';
    }

    @Override
    public String getTipoUsuario() {
        return "";
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
