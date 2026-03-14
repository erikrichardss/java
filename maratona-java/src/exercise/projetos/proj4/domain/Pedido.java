package exercise.projetos.proj4.domain;

import exercise.projetos.proj4.enums.StatusPedido;
import exercise.projetos.proj4.exceptions.PedidoVazioException;
import exercise.projetos.proj4.exceptions.QuantidadeInvalidException;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private StatusPedido statusPedido;
    private List<ItemPedido> itemPedidos;

    public Pedido() {
        this.statusPedido = StatusPedido.INICIADO;
        this.itemPedidos = new ArrayList<>();
    }

    public void adicionarItens(ItemPedido itemPedido) {
        if (itemPedido == null) {
            throw new PedidoVazioException("Carrinho vazio");
        }

        if (itemPedido.getQuantidade() <= 0) {
            throw new QuantidadeInvalidException("Quantidade inválida");
        }

        if (statusPedido == StatusPedido.FINALIZADO) {
            throw new IllegalArgumentException("Pedido finalizado");
        }

        this.statusPedido = StatusPedido.CRIADO;
        this.itemPedidos.add(itemPedido);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido itemPedido : itemPedidos) {
            total += itemPedido.calcularTotal();
        }

        return total;
    }

    public void finalizarPedido() {
        if (itemPedidos.isEmpty()) {
            throw new IllegalArgumentException("Pedido Vazio");
        }

        for (ItemPedido itemPedido : itemPedidos) {
            System.out.println("Tipo: " + itemPedido.getProduto().getTipoProduto().getNome()
                    + ", produto: " + itemPedido.getProduto().getNome() +
                    ", preço: " + itemPedido.getProduto().getPreco() +
                    ", quantidade: " + itemPedido.getQuantidade());
        }

        this.statusPedido = StatusPedido.FINALIZADO;
        System.out.printf("Total: %.2f \n", calcularTotal());
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }
}
