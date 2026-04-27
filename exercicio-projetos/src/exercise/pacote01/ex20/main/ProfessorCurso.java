package exercise.pacote01.ex20.main;

import exercise.pacote01.ex20.classe.Curso;
import exercise.pacote01.ex20.classe.Professor;

public class ProfessorCurso {
    public static void main(String[] args) {
        Professor professor = new Professor("Marcos", "Ensino");
        Curso curso = new Curso("Desenvolvimento Web", professor);

        curso.exibirCurso();
    }
}
