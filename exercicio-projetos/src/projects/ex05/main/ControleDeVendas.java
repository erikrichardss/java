package projects.ex05.main;

import projects.ex05.domain.Cliente;
import projects.ex05.domain.ItemPedido;
import projects.ex05.domain.Pedido;
import projects.ex05.domain.Produto;
import projects.ex05.enums.TipoPagamento;
import projects.ex05.service.ArquivoService;

import java.util.ArrayList;
import java.util.List;

public class ControleDeVendas {

    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Produto> produtos = new ArrayList<>();

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Erik", "erik_rich123@gmail.com.br");
        Produto produto = new Produto("Mouse", 149.90, 71);
        ItemPedido itemPedido = new ItemPedido(produto, 2);
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItemCarrinho(itemPedido);
        System.out.println(pedido.calcularTotal());
        pedido.finalizarPedido(TipoPagamento.DINHEIRO, 299.8);
        ArquivoService arquivoService = new ArquivoService();
        arquivoService.salvarPedido(pedido);
        arquivoService.lerPedido();

//        criarClientes();
//        criarProdutos();
    }

    public static void criarClientes() {

        try {

            clientes.add(new Cliente("Erik", "erik_rich123@gmail.com.br"));
        } catch (IllegalArgumentException e) {

            e.printStackTrace();
        }
    }

    public static void criarProdutos() {

        produtos.add(new Produto("Mouse", 149.90, 71));
    }

    public static void criarPedido() {


    }
}
