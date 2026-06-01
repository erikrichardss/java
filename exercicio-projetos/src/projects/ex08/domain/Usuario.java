package projects.ex08.domain;

public abstract class Usuario {

    private Integer id = 0;
    private String nome;
    private String email;

    {

        this.id++;
    }

    public Usuario(String nome, String email) {

        this.nome = nome;
        this.email = email;
    }

    public abstract String getTipoUsuario();

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
