package exercise.pacote01.ex27.classe;

public class Biblioteca {
    private String nome;
    private Livro[] livros;
    private int quantidadeLivros;

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public Biblioteca(String nome, Livro[] livros) {
        this(nome);
        this.livros = livros;
    }

    public void adicionarLivro(Livro[] livros) {
        if (this.livros == null) { return; }
         this.livros = livros;
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}
