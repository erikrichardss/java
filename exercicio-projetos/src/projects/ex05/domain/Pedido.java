package projects.ex05.domain;

import exercise.pacote02.ex23.exception.CarrinhoVazioException;
import projects.ex05.enums.StatusPedido;
import projects.ex05.enums.TipoPagamento;
import projects.ex05.pagamentos.ProcessarPagamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<ItemPedido> itemPedidos;
    private StatusPedido statusPedido;
    private LocalDate dataPedido;
    private ProcessarPagamento processarPagamento;

    public Pedido(Cliente cliente) {

        this.cliente = cliente;
        this.statusPedido = StatusPedido.CRIADO;
        this.dataPedido = LocalDate.now();
        this.itemPedidos = new ArrayList<>();
        this.processarPagamento = new ProcessarPagamento();
    }

    public void adicionarItemCarrinho(ItemPedido itemPedido) {

        if (itemPedido.getQuantidade() <= 0) {

            throw new IllegalArgumentException("Estoque inválido");
        }

        itemPedidos.add(itemPedido);
    }

    public double calcularTotal() {

        double total = 0;

        if (itemPedidos.isEmpty()) {

            throw new CarrinhoVazioException("Carrinho vázio");
        }

        for (ItemPedido itemPedido : itemPedidos) {

            total += itemPedido.getQuantidade() * itemPedido.getProduto().getPreco();
        }

        return total;
    }

    public void finalizarPedido(TipoPagamento tipoPagamento, double valor) {

        if (this.statusPedido == StatusPedido.CANCELADO || this.statusPedido == StatusPedido.PAGO) {

            throw new IllegalArgumentException("Status pedido:" + this.statusPedido.getNomeStatus());
        }

        if (this.itemPedidos.isEmpty()) {

            throw new CarrinhoVazioException("Carrinho vazio");
        }

        if (valor < calcularTotal()) {

            throw new IllegalArgumentException("Pagamento recusado");
        }

        if (tipoPagamento == null) {

            throw new IllegalArgumentException("Detalhes do pagamento não fornecido");
        }

        this.processarPagamento.processarPagamento(tipoPagamento, valor);
        this.statusPedido = StatusPedido.PAGO;

        this.itemPedidos.removeAll(itemPedidos);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public LocalDate getDataPedido() {
        return dataPedido;
    }
}
