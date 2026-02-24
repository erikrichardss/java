package exercise.pacote02.ex12.classe;

public class Usuario {
    private String nome;
    private String cpf;
    private Livro livroEmprestado;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void pegarLivro(Livro livro) {
        if (this.livroEmprestado != null) {
            System.out.println("Usuário já possui livro");;
            return;
        }

        if (!livro.isDisponivel()) {
            System.out.println("Livro não está disponível");
            return;
        }

        livro.emprestarLivro();
        this.livroEmprestado = livro;

        System.out.println("Livro emprestado com sucesso.");
    }

    public void devolverLivro(Livro livro) {
        if (this.livroEmprestado != null) {
            System.out.println("Livro devolvido");
            livro.devolverLivro();
            this.livroEmprestado = null;
        } else {
            System.out.println("Usuario não possui livro");
        }
    }

    public void exibirInformacaoUsuario() {
        System.out.print("Nome: " + getNome());

        if (this.livroEmprestado != null) {
            System.out.println(", livro pego: " + livroEmprestado.getTitulo());
        } else {
            System.out.println("Nenhum livro emprestado.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }
}
