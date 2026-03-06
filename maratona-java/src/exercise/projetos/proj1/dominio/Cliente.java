package exercise.projetos.proj1.dominio;

import exercise.projetos.proj1.repositorio.TipoCliente;
import exercise.projetos.proj2.dominio.Pessoa;

public class Cliente extends Pessoa {
    private TipoCliente tipoCliente;

    public Cliente(String nome, String email, TipoCliente tipoCliente) {
        super(nome, email);
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getTipo() {
        return tipoCliente;
    }
}
