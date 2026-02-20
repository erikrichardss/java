package exercise.pacote02.ex07.main;

import exercise.pacote02.ex07.classe.NivelDeAcesso;
import exercise.pacote02.ex07.classe.Usuario;

public class NivelDeAcessoTest {
    public static void main(String[] args) {
        Usuario usuarioUm = new Usuario("Daimon", NivelDeAcesso.VISITANTE);
        Usuario usuarioDois = new Usuario("Emanuela", NivelDeAcesso.FUNCIONARIO);
        Usuario usuarioTres = new Usuario("Molly", NivelDeAcesso.GERENTE);
        Usuario usuarioQuatro = new Usuario("Erik", NivelDeAcesso.ADMIN);

        System.out.println(usuarioUm);
        System.out.println(usuarioDois);
        System.out.println(usuarioTres);
        System.out.println(usuarioQuatro);

        usuarioDois.gerenciarUsuario();
        usuarioDois.gerenciarUsuario();
        usuarioTres.gerenciarUsuario();
        usuarioQuatro.gerenciarUsuario();

    }
}
