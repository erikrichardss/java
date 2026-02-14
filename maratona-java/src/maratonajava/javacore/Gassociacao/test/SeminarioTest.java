package maratonajava.javacore.Gassociacao.test;

import maratonajava.javacore.Gassociacao.classe.Aluno;
import maratonajava.javacore.Gassociacao.classe.Local;
import maratonajava.javacore.Gassociacao.classe.Professor;
import maratonajava.javacore.Gassociacao.classe.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Aluno alunoUm = new Aluno("Erik", 18);
        Aluno alunoDois = new Aluno("Ana", 21);
        Aluno alunoTres = new Aluno("Yara", 23);
        Aluno alunoQuatro = new Aluno("Mateus", 22);
        Aluno[] alunos = new Aluno[]{alunoUm, alunoDois, alunoTres, alunoQuatro};

        Seminario seminarioUm = new Seminario("Vespertina");
        Seminario seminarioDois = new Seminario("São Gonçalo");
        Seminario[] seminario = new Seminario[]{seminarioUm, seminarioDois};

        Professor professor = new Professor("João Paulo", "Ciências Contábeis");

        Local localUm = new Local("Avenida Brásilia");
        Local localDois = new Local("Avenida Jacurú");

        seminarioDois.adicionarProfessor(professor);
        seminarioDois.adicionarAlunos(alunos);
        seminarioDois.adicionarLocal(localUm);

        seminarioUm.adicionarLocal(localDois);
        seminarioUm.adicionarProfessor(professor);

        professor.seminarios(seminario);

        seminarioDois.imprimirSeminario();
    }
}
