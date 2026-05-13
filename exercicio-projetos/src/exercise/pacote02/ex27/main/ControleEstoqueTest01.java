package exercise.pacote02.ex27.main;

import exercise.pacote02.ex27.classe.ControleEstoque;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ControleEstoqueTest01 {

    public static void main(String[] args) {

        Map<String, Integer> estoqueMap = new HashMap<>();

        ControleEstoque controleEstoque = new ControleEstoque("Tablet", 29);
        ControleEstoque controleEstoque2 = new ControleEstoque("NOtePad", 16);
        ControleEstoque controleEstoque3 = new ControleEstoque("Mouse", 24);
        ControleEstoque controleEstoque4 = new ControleEstoque("Tv", 59);

        estoqueMap.put(controleEstoque.getNomeProduto(), controleEstoque.getQuantidadeEstoque());
        estoqueMap.put(controleEstoque2.getNomeProduto(), controleEstoque2.getQuantidadeEstoque());
        estoqueMap.put(controleEstoque3.getNomeProduto(), controleEstoque3.getQuantidadeEstoque());
        estoqueMap.put(controleEstoque4.getNomeProduto(), controleEstoque4.getQuantidadeEstoque());

        estoqueMap.remove(controleEstoque3.getNomeProduto());

        int maiorValor = Collections.max(estoqueMap.values());
        System.out.println(maiorValor);

        for (Map.Entry<String, Integer> entry : estoqueMap.entrySet()) {

            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
