package exercise.pacote02.ex12.classe;

public class Biblioteca {
    private String nome;
    private Livro[] livros;
    private int quantidadeLivros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.quantidadeLivros++;
    }

    public void adicionarLivro(Livro[] livro) {
        this.livros = livro;
    }

    public void listarLivros() {
        if (this.livros != null) {

            System.out.println("----- Livros da Biblioteca -----");
            for (Livro listarLivros : livros) {
                System.out.println("Titulo: " + listarLivros.getTitulo() +
                        ", autor: " + listarLivros.getAutor());
            }
        } else {
            System.out.println("Não possui livros.");
        }
    }

    public void buscarLivroPorTitulo(String titulo) {
        for (Livro buscarLivro : this.livros) {

            if (buscarLivro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado: " + buscarLivro.getTitulo() +
                        ", autor: " + buscarLivro.getAutor());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public Livro[] getLivros() {
        return livros;
    }

    public int getQuantidadeLivros() {
        return quantidadeLivros;
    }
}
