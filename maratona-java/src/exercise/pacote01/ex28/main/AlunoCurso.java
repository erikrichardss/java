package exercise.pacote01.ex28.main;

import exercise.pacote01.ex28.classe.Aluno;
import exercise.pacote01.ex28.classe.Curso;

public class AlunoCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Elétrica");
        Aluno alunoUm = new Aluno("Erik");
        Aluno alunoDois = new Aluno("Ana");
        Aluno[] alunos = {alunoUm, alunoDois};

        curso.adicionarAluno(alunos);
        alunoUm.matricular(curso);
        alunoDois.matricular(curso);

        curso.getCurso();

        for (Aluno aluno : curso.getAluno()) {
            if (aluno != null) {
                System.out.println(aluno.getNome());
            }
        }
    }
}
