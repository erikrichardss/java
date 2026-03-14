package exercise.projetos.proj4.main;

import exercise.projetos.proj4.domain.ItemPedido;
import exercise.projetos.proj4.domain.Pedido;
import exercise.projetos.proj4.domain.Produto;
import exercise.projetos.proj4.enums.StatusPedido;
import exercise.projetos.proj4.enums.TipoProduto;
import exercise.projetos.proj4.exceptions.PedidoVazioException;
import exercise.projetos.proj4.exceptions.QuantidadeInvalidException;

import java.util.List;

public class Restaurante {
    public static void main(String[] args) {
        Produto comida1 = new Produto("Hamburguer", 33.90, TipoProduto.LANCHE);
        Produto comida2 = new Produto("Pão de Queijo", 9.90, TipoProduto.LANCHE);
        Produto comida3 = new Produto("Pizza", 64.90, TipoProduto.LANCHE);
        Produto bebida1 = new Produto("Refrigerante", 14.90, TipoProduto.BEBIDA);
        Produto bebida2 = new Produto("Suco de Uva", 17.90, TipoProduto.BEBIDA);
        Produto bebida3 = new Produto("Café", 8.90, TipoProduto.BEBIDA);
        Produto sobremesa1 = new Produto("Mousse", 15.90, TipoProduto.SOBREMESA);
        Produto sobremesa2 = new Produto("Bolo", 9.90, TipoProduto.SOBREMESA);
        Produto sobremesa3 = new Produto("Pudim", 11.90, TipoProduto.SOBREMESA);

        ItemPedido itemPedido = new ItemPedido(comida2, 7);
        ItemPedido itemPedido1 = new ItemPedido(comida3, 4);
        ItemPedido itemPedido2 = new ItemPedido(bebida3, 2);
        ItemPedido itemPedido3 = new ItemPedido(sobremesa2, 3);

        Pedido pedido = new Pedido();

        ItemPedido[] itemPedidos = {itemPedido, itemPedido1, itemPedido2, itemPedido3};

        for (ItemPedido itemPedidoArr : itemPedidos) {
            try {
                pedido.adicionarItens(itemPedidoArr);
            } catch (PedidoVazioException | QuantidadeInvalidException | IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        try {
            pedido.finalizarPedido();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Pedido finalizado");
        }

        try {
            pedido.adicionarItens(itemPedido);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
