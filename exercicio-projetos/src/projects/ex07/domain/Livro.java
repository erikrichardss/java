package projects.ex07.domain;

public class Livro extends Material {

    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {

        super(titulo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + getTitulo() +
                "autor='" + autor + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }
}
