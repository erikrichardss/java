package exercise.ex20.classe;

public class Curso {
    private String nome;
    private Professor curso;

    public Curso(String nome, Professor curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public void exibirCurso() {
        System.out.println(this.nome);
        System.out.println(curso.getNome());
    }
}
