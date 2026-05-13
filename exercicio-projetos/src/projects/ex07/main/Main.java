package projects.ex07.main;

import projects.ex07.domain.Emprestimo;
import projects.ex07.domain.Usuario;
import projects.ex07.enums.TipoUsuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Erik", "erik@gmail.coim", TipoUsuario.ALUNO);
    }
}
