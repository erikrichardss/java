package exercise.projetos.proj4.enums;

public enum StatusPedido {
    INICIADO("Iniciado"),
    CRIADO("Criado"),
    FINALIZADO("Finalizado"),
    CANCELADO("Cancelado");

    private String status;

    StatusPedido(String status) {
        this.status = status;
    }

    public String getStatus() { return status; }
}
