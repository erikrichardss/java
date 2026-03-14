package exercise.pacote02.ex24.classe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {
    public List<Produto> carregarProdutos(String caminhoArquivo) {
        List<Produto> produtoList = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo))) {
            Produto produto = new Produto("Notebook", 3500.90, 6);

            produtoList.add(produto);
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }

        return produtoList;
    }
}
