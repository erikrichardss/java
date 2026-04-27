package projects.ex04.enums;

public enum TipoEstudo {

    BACKEND("Back-end"),
    FRONTEND("Front-end"),
    BANCODEDADOS("Banco de Dados"),
    OUTROS("Outros");

    private String nome;

    TipoEstudo(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
