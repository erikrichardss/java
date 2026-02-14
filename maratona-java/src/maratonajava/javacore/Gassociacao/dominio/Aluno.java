package maratonajava.javacore.Gassociacao.dominio;

import maratonajava.javacore.Gassociacao.classe.Seminario;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
