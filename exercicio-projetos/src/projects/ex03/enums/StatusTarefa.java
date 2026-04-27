package projects.ex03.enums;

public enum StatusTarefa {

    PENDENTE("Pendente"),
    CONCLUIDA("Concluida");

    private String nome;

    StatusTarefa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
