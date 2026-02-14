package exercise.pacote01.ex28.classe;

public class Aluno {
    private String nome;
    private Curso curso;

    public Aluno(String nome) { this.nome = nome; }

    public void matricular(Curso curso) {
        if(this.curso != null) {
            System.out.println("Aluno já matriculádo!");
            return;
        }

        this.curso = curso;
    }

    public void mostrarAlunos() {
        System.out.println("Curso: " + curso);
        System.out.println("Alunos: ");

        Aluno[] alunos = curso.getAluno();

        for (Aluno nomeAluno : alunos) {
            System.out.println(nomeAluno.getNome());
        }
    }

    public String getNome () { return nome; }

    public Curso getCurso() { return curso; }
}
