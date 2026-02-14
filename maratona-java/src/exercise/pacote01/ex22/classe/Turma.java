package exercise.pacote01.ex22.classe;

public class Turma {
    private String nome;
    private Aluno[] aluno;

    public Turma(String nome, Aluno[] aluno) {
        this.nome = nome;
        this.aluno = aluno;
    }

    public void adicionarAluno(Aluno[] aluno) {
        if (this.aluno == null) {

            this.aluno = aluno;

        } else if (this.aluno == null) {

            this.aluno = aluno;

        } else {

            if (this.aluno == null) {
                this.aluno = aluno;
            }
        }
    }

    public void imprimir() {
        for (Aluno alunoImprime : aluno) {
            System.out.println(alunoImprime.getNome());
        }
    }

    public String getNome() { return nome; }

    public Aluno[] getAluno() { return aluno; }
}