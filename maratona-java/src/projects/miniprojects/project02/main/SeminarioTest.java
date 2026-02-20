package projects.miniprojects.project02.main;

import projects.miniprojects.project02.clas.Aluno;
import projects.miniprojects.project02.clas.Local;
import projects.miniprojects.project02.clas.Professor;
import projects.miniprojects.project02.clas.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Avenida das Flores");

        Aluno aluno = new Aluno("Erik", 18);
        Aluno[] alunos = new Aluno[]{aluno};

        Seminario seminario = new Seminario("Ecoda", alunos, local);
        Seminario[] seminarios = new Seminario[]{seminario};

        Professor professor = new Professor("Major", "Gerenciamento de Tarefas");
        professor.setSeminarios(seminarios);

        professor.imprimirProfessor();
    }
}
