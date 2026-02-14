package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.dominio.Aluno;
import maratonajava.javacore.Gassociacao.dominio.Local;
import maratonajava.javacore.Gassociacao.dominio.Professor;
import maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras");

        Aluno aluno = new Aluno("Luffy", 17);
        Aluno[] alunosParaSeminario = {aluno};

        Professor professor = new Professor("Barba Branca", "Pirata");

        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
        Seminario[] seminarioDisponiveis = {seminario};

        professor.setSeminarioa(seminarioDisponiveis);

        professor.imprime();

    }
}
