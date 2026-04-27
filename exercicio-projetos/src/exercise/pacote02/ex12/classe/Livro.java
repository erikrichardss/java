package exercise.pacote02.ex12.classe;

public class Livro {
    protected String titulo;
    private String autor;
    private boolean disponivel;

    public Livro(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public void emprestarLivro() {
        if (this.disponivel == true) {
            this.disponivel = false;
        } else {
            System.out.println("Livro indisponivel.");
        }
    }

    public void devolverLivro() {
        if (this.disponivel == false) {
            this.disponivel = true;
        } else {
            System.out.println("Você não tem livros.");
        }
    }

    public void exibirInformacaoLivro() {
        System.out.println("Titulo: " + getTitulo() +
                ", autor: " + getAutor() +
                ", status: " + isDisponivel());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
