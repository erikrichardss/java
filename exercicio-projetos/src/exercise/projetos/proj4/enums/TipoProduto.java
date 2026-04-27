package exercise.projetos.proj4.enums;

public enum TipoProduto {
    LANCHE("Lanche"),
    BEBIDA("Bebida"),
    SOBREMESA("Sobresa");

    private String nome;
    TipoProduto(String nome) {
        this.nome = nome;
    }

    public String getNome() { return nome; }
}
