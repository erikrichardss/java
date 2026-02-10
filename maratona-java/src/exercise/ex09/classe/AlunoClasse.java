package exercise.ex09.classe;

public class AlunoClasse {
    private String nome;
    private int idade;

    public AlunoClasse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
