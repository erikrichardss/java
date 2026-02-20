package projects.miniprojects.project02.clas;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] aluno, Local local) {
        this(titulo);
        this.alunos = aluno;
        this.local = local;
    }

    public String getTitulo() { return this.titulo; }

    public Aluno[] getAlunos() { return alunos; }

    public Local getLocal() { return local; }
}
