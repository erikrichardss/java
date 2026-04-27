package projects.ex05.enums;

public enum StatusPedido {

    CRIADO ("Criado"),
    PAGO ("Pago"),
    CANCELADO ("Cancelado");

    private String nomeStatus;

    StatusPedido(String nomeStatus) {

        this.nomeStatus = nomeStatus;
    }

    public String getNomeStatus() {
        return nomeStatus;
    }
}
