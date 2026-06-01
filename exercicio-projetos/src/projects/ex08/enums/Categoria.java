package projects.ex08.enums;

public enum Categoria {

    ELETRONICOS("Eletronicos"),
    LIVROS("Livros"),
    GAMES("Games"),
    ROUPAS("Roupas");

    private String nomeCategoria;

    Categoria(String nomeCategoria) {

        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria() {

        return nomeCategoria;
    }
}
