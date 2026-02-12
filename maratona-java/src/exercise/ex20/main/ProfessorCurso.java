package exercise.ex20.main;

import exercise.ex20.classe.Curso;
import exercise.ex20.classe.Professor;

public class ProfessorCurso {
    public static void main(String[] args) {
        Professor professor = new Professor("Marcos", "Ensino");
        Curso curso = new Curso("Desenvolvimento Web", professor);

        curso.exibirCurso();
    }
}
