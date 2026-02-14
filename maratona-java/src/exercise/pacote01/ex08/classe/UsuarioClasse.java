package exercise.pacote01.ex08.classe;

public class UsuarioClasse {
    private String email;
    private String senha;

    private boolean validarSenha(String senha) {
        if (senha.length() >= 6) {
            return true;
        }
        return false;
    }

    public boolean login(String email, String senha) {
        this.senha = senha;
        this.email = email;

        return validarSenha(senha);
    }
}
