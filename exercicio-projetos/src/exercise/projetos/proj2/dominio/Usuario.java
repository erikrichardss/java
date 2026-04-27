package exercise.projetos.proj2.dominio;

import exercise.projetos.proj2.repositorio.TipoUsuario;

public class Usuario extends Pessoa {
    private TipoUsuario tipoUsuario;
    private boolean bloqueado;

    public Usuario(String nome, String cpf, TipoUsuario tipoUsuario) {
        super(nome, cpf);
        this.bloqueado = false;
        this.tipoUsuario = tipoUsuario;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }
}
