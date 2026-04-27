package exercise.projetos.proj2.dominio;

public class DVD extends Material {
    public DVD(int id, String titulo) {
        super(id, titulo);
    }

    @Override
    public int getPrazoEmprestimo() {
        return 5;
    }
}
