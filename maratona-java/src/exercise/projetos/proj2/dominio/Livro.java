package exercise.projetos.proj2.dominio;

public class Livro extends Material {
    public Livro(int id, String titulo) {
        super(id, titulo);
    }

    @Override
    public int getPrazoEmprestimo() {
        return 7;
    }
}
