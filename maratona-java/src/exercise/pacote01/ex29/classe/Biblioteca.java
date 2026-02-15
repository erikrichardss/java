package exercise.pacote01.ex29.classe;

public class Biblioteca {
    private String nome;
    private Livro[] livros;

    public Biblioteca(String nome) { this.nome = nome; }

    public Biblioteca(String nome, Livro[] livros) {
        this(nome);
        this.livros = livros;
    }

    public String getNome() { return nome; }

    public Livro[] getLivros() { return livros; }

    public void listarLivrosCadastrados() {
        System.out.println("----- Biblioteca ------");
        System.out.println("Nome da biblioteca: " + nome);
        System.out.println();

        if (this.livros != null || this.livros.length == 0) {

            System.out.println("|| Listagem de Livros ||");
            System.out.println();

            for (Livro livro : livros) {
                livro.imprimirDadosLivro();
            }
            System.out.println("------------------------------");
        } else {
            System.out.println("Não há livros cadastrados.");
            return;
        }
    }
}
