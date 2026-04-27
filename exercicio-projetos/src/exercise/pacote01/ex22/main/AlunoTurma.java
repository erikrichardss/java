package exercise.pacote01.ex22.main;

import exercise.pacote01.ex22.classe.Aluno;
import exercise.pacote01.ex22.classe.Turma;

public class AlunoTurma {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Erik");
        Aluno aluno2 = new Aluno("Queirós");
        Aluno aluno3 = new Aluno("Amós");
        Aluno[] alunos = new Aluno[]{aluno1, aluno2, aluno3};
        Turma turma = new Turma("Machado de Guerra", alunos);

        turma.imprimir();

    }
}
