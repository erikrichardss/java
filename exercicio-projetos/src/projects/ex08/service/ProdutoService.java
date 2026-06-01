package projects.ex08.service;

import projects.ex08.domain.Produto;
import projects.ex08.repository.ProdutoRepository;

import java.util.List;
import java.util.Optional;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public void cadastrarProduto(Produto produto) {

        produtoRepository.salvar(produto);
    }

    public int atualizarEstoque(Produto produto, int estoque) {

        produto.atualizarEstoque(estoque);

        return produto.getEstoque();
    }

    public Optional<Produto> buscarProduto(Integer id) {

        return produtoRepository.buscarPorId(id);
    }

    public void listarProdutos() {

        List<Produto> produtoList = produtoRepository.listarTodos();

        produtoList.forEach(produto -> System.out.println(produto.toString()));
    }
}
