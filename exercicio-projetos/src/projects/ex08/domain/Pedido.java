package projects.ex08.domain;

import projects.ex08.enums.StatusPedido;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Integer id = 0;
    private Cliente cliente;
    private List<ItemCarrinho> itemCarrinhos = new ArrayList<>();
    private StatusPedido statusPedido;
    private LocalDateTime dataCriacaoPedido;

    {

        id++;
    }

    public double calcularTotal() {

        double total = 0;

        for (ItemCarrinho itemCarrinho : itemCarrinhos) {

            total += itemCarrinho.calcularSubtotal();
        }

        return total;
    }

    public StatusPedido atualizarStatus(StatusPedido statusPedido) {

        return this.statusPedido = statusPedido;
    }

    public void gerarResumo() {

        System.out.println("Cliente: " + cliente);

        for (ItemCarrinho itemCarrinho : this.itemCarrinhos) {

            System.out.println(itemCarrinho.toString());
        }
    }

    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemCarrinho> getItemCarrinhos() {
        return itemCarrinhos;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public LocalDateTime getDataCriacaoPedido() {
        return dataCriacaoPedido;
    }
}
