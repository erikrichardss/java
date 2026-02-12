package exercise.ex15.main;

import exercise.ex15.classe.AlunoClasse;

public class Aluno {
    public static void main(String[] args) {
        AlunoClasse alunoUm = new AlunoClasse("Erik");
        AlunoClasse alunoTres = new AlunoClasse("Maria");
        AlunoClasse alunoQuatro = new AlunoClasse("Ana");

        alunoUm.imprimir();
        alunoTres.imprimir();
        alunoQuatro.imprimir();
    }
}
