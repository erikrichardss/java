package projects.ex08.enums;

public enum StatusPedido {

    AGUARDANDO_PAGAMENTO("Aguardando pagamento"),
    PAGO("Pago"),
    ENVIADO("Enviado"),
    CANCELADO("Cancelado");

    private String nomeStatusPedido;

    StatusPedido(String nomeStatusPedido) {
        this.nomeStatusPedido = nomeStatusPedido;
    }

    public String getNomeStatusPedido() {
        return nomeStatusPedido;
    }
}
