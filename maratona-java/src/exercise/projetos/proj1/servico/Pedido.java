package exercise.projetos.proj1.servico;

import exercise.projetos.proj1.dominio.Cliente;
import exercise.projetos.proj1.repositorio.Calculavel;

import java.util.List;

public class Pedido implements Calculavel {
    private Cliente cliente;
    private List<ItemPedido> itemPedidos;
    private String dataPedido;

    public Pedido(Cliente cliente, List<ItemPedido> itemPedidos, String dataPedido) {
        this.cliente = cliente;
        this.itemPedidos = itemPedidos;
        this.dataPedido = dataPedido;
    }

    @Override
    public double calcularTotal() {
        double somarItens = 0;
        for (ItemPedido itemPedido : itemPedidos) {
            somarItens += itemPedido.getProduto().getPreco();
        }
        System.out.println("Subtotal: " + somarItens);
        System.out.println("Desconto: " + (somarItens - this.cliente.getTipo().tipoCliente(somarItens)));
        return this.cliente.getTipo().tipoCliente(somarItens);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItemPedidos() {
        return itemPedidos;
    }

    public String getDataPedido() {
        return dataPedido;
    }
}
