package exercise.pacote02.ex06.classe;

public class Pedido {
    private String cliente;
    private double valor;
    private StatusPedido statusPedido;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        statusPedido = StatusPedido.AGUARDANDO_PAGAMENTO;
    }

    public void alterarStatus(StatusPedido novoStatus) {
        this.statusPedido = novoStatus;
    }

    public void exibirPedido() {
        System.out.println("Nome: " + getCliente() +
                ", valor: " + getValor() +
                ", status: " + getStatusPedido());
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }
}
