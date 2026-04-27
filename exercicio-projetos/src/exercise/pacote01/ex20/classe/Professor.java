package exercise.pacote01.ex20.classe;

public class Professor {
    private String nome;
    private String especialidade;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void setNome(String nome) { this.nome = nome; }

    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    public String getEspecialidade() { return especialidade; }

    public String getNome() { return nome; }
}
