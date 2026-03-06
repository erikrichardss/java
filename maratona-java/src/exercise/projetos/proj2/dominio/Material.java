package exercise.projetos.proj2.dominio;

public abstract class Material {
    private int id;
    private String titulo;
    private boolean disponivel;

    public Material(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        this.disponivel = true;
    }

    public abstract int getPrazoEmprestimo();

    public boolean statusMaterial(boolean disponivel) {
        return this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
