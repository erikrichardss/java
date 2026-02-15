package exercise.pacote01.ex29.classe;

public class Livro {
    private String titulo;
    private int anoDePublicacao;
    private Autor autor;

    public Livro(String titulo, int anoDePublicacao) {
        this.titulo = titulo;
        this.anoDePublicacao = anoDePublicacao;
    }

    public Livro(String titulo, int anoDePublicacao, Autor autor) {
        this(titulo, anoDePublicacao);
        this.autor = autor;
    }

    public void imprimirDadosLivro() {
        System.out.println("** Livro **");
        System.out.println("Título: " + titulo);
        System.out.println("Ano de publicação: " + anoDePublicacao);

        if (this.autor == null) { return; }

        autor.imprimirDadosAutor();
    }

    public String getTitulo() { return titulo; }

    public int getAnoDePublicacao() { return  anoDePublicacao; }

    public Autor getAutor() { return autor; }
}
