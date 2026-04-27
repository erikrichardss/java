package exercise.pacote01.ex08.main;

import exercise.pacote01.ex08.classe.UsuarioClasse;

public class Usuario {
    public static void main(String[] args) {
        UsuarioClasse usuario = new UsuarioClasse();

        System.out.println(usuario.login("erikrichard@gmail.com", "eirk1234"));
        System.out.println(usuario.login("erikrichard@gmail.com", "ei12"));
    }
}
