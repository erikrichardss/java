package exercise.pacote02.ex06.classe;

public enum StatusPedido {
    AGUARDANDO_PAGAMENTO("Aguardando pagamento"),
    PAGO("Pago"),
    ENVIADO("Enviado"),
    ENTREGUE("Entregue"),
    CANCELADO("Cancelado");

    private String statusDoPedido;

    StatusPedido(String statusDoPedido) { this.statusDoPedido = statusDoPedido; }

    public String getStatusDoPedido() { return statusDoPedido; }
}
