package exercise.pacote02.ex29.main;

public class Livro extends Item {

    private String autor;

    public Livro(String titulo, String autor) {
        super(titulo);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + "Livro{" +
                "autor='" + autor + '\'' +
                '}';
    }

    public String getAutor() {
        return autor;
    }
}
