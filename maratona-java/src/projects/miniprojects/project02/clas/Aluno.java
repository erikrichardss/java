package projects.miniprojects.project02.clas;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this(nome, idade);
        this.seminario = seminario;
    }

    public String getNome() { return nome; }

    public int getIdade() { return idade; }

    public Seminario getSeminario() { return this.seminario; }
}
