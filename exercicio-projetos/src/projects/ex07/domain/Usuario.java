package projects.ex07.domain;

import projects.ex07.enums.TipoUsuario;

import java.time.LocalDate;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private TipoUsuario tipoUsuario;
    private LocalDate dataCadastro;

    public Usuario(String nome, String email, TipoUsuario tipoUsuario) {

        this.id = ThreadLocalRandom.current().nextInt();
        this.nome = nome;
        this.email = email;
        this.tipoUsuario = tipoUsuario;
        this.dataCadastro = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
}
