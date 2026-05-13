package projects.ex06.enums;

public enum TipoEvento {

    PALESTRA("Palestra"),
    WORKSHOP("WorkShop"),
    CURSO("Curso");

    private String nome;

    TipoEvento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
