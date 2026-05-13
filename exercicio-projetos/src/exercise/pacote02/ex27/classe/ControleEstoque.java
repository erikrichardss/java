package exercise.pacote02.ex27.classe;

import java.util.Objects;

public class ControleEstoque {

    private String nomeProduto;
    private int quantidadeEstoque;

    public ControleEstoque(String nomeProduto, int quantidadeEstoque) {
        this.nomeProduto = nomeProduto;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ControleEstoque that = (ControleEstoque) o;
        return Objects.equals(nomeProduto, that.nomeProduto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nomeProduto);
    }

    @Override
    public String toString() {
        return "ControleEstoque{" +
                "nomeProduto='" + nomeProduto + '\'' +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
