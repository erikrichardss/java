package projects.ex03.enums;

public enum Prioridade {

    BAIXA("Baixa"),
    MEDIA("Media"),
    ALTA("Alta");

    private String nome;

    Prioridade(String nome) {

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
