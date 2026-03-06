package exercise.pacote02.ex22.main;

import exercise.pacote02.ex22.Exception.EstoqueException;
import exercise.pacote02.ex22.classe.ProdutoService;

import java.io.IOException;
import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*Cadastro de produto*");

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Preço: ");
        double preco = scanner.nextDouble();

        System.out.println("Quantidade: ");
        int quantidade = scanner.nextInt();

        ProdutoTest.tratarProduto(nome, preco, quantidade);
    }

    private static void tratarProduto(String nome, double preco, int quantidade) {

        ProdutoService produtoService = new ProdutoService();

        try {

            produtoService.cadastrarProduto(nome, preco, quantidade);

        } catch (IllegalArgumentException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } catch (EstoqueException e) {

            e.printStackTrace();

        } finally {

            System.out.println("Processo finalizado");

        }
    }
}
