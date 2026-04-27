package exercise.projetos.proj1.test;

import exercise.projetos.proj1.dominio.Cliente;
import exercise.projetos.proj1.repositorio.TipoCliente;
import exercise.projetos.proj1.servico.ItemPedido;
import exercise.projetos.proj1.servico.Pedido;
import exercise.projetos.proj1.servico.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDePedidos {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Erik", "erik@hotmail.com", TipoCliente.PREMIUM);

        Produto produto = new Produto("D121", "Teclado Mcânico", 350);

        ItemPedido itemPedido = new ItemPedido(produto);

        List<ItemPedido> pedidoList = new ArrayList<>();
        pedidoList.add(itemPedido);

        Pedido pedido = new Pedido(cliente1, pedidoList, "25/02/2025");

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(pedido);

        for (Pedido pedidoFor : pedidos) {
            System.out.println("Cliente: " + pedidoFor.getCliente().getNome());
            System.out.println("Tipo: " + pedidoFor.getCliente().getTipo());
        }

        System.out.println("\nItens:");

        for (ItemPedido itemPedidos : pedidoList) {
            System.out.println("Produto: " + itemPedidos.getProduto().getNome());
            System.out.println("Preço: " + itemPedidos.getProduto().getPreco());
            System.out.println("------------------------------------------------");
        }

        System.out.println("Total final: " + pedido.calcularTotal());
    }
}
