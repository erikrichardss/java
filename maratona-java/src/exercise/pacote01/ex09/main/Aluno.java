package exercise.pacote01.ex09.main;

import exercise.pacote01.ex09.classe.AlunoClasse;

public class Aluno {
    public static void main(String[] args) {
        AlunoClasse aluno = new AlunoClasse("Erik", 18);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
    }
}
