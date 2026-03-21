package exercise.projetos.proj5.enums;

public enum StatusPlano {
    EXPIRADO ("Expirado"),
    ATIVO("Ativo"),
    VIP("Vip");

    private String status;

    StatusPlano(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
