package projects.ex06.enums;

public enum StatusInscriao {

    ATIVA("Ativa"),
    CANCELADA("Cancelada");

    private String nome;

    StatusInscriao(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
