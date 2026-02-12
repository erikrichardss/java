package exercise.ex14.main;

import exercise.ex14.classe.PessoaClasse;

public class Pessoa {
    public static void main(String[] args) {
        PessoaClasse pessoaUm = new PessoaClasse("Erik", 18);
        PessoaClasse pessoaDois = new PessoaClasse("Ana", 16);

        System.out.println(pessoaUm.getNome());
        System.out.println(pessoaUm.getIdade());

        System.out.println(pessoaDois.getNome());
        System.out.println(pessoaDois.getIdade());
    }
}
