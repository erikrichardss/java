package exercise.pacote01.ex28.classe;

public class Curso {
    private String curso;
    private Aluno[] aluno;

    public Curso(String curso) { this.curso = curso; }

    public void adicionarAluno(Aluno[] aluno) { this.aluno = aluno; }

    public String getCurso() { return curso; }

    public Aluno[] getAluno() { return aluno; }
}
