package exercise.ex14.classe;

public class PessoaClasse {
    private String nome;
    private int idade;

    {
        this.nome = "Desconhecido";
        this.idade = 0;

        System.out.println("Bloco de inicialização executado!");
    }

    public PessoaClasse(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;

        System.out.println("Contrutor executado!");
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
