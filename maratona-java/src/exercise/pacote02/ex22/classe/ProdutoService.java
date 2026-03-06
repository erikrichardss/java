package exercise.pacote02.ex22.classe;

import exercise.pacote02.ex22.Exception.EstoqueException;

import java.io.IOException;

public class ProdutoService {

    public void cadastrarProduto(String nome, double valor, int quantidade)
            throws EstoqueException, IOException {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Erro: nome vazio");
        }

        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: valor inválido");
        }

        if (quantidade < 0) {
            throw new IllegalArgumentException("Erro: quantidade inválida");
        }

        simularConexaoBanco();

        if (quantidade > 1000) {
            throw new EstoqueException();
        }

        System.out.println("Produto cadastrado");
    }

    private void simularConexaoBanco() throws IOException {
        throw new IOException("Erro ao conectar com banco de dados");
    }
}
