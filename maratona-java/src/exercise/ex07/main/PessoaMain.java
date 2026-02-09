package exercise.ex07.main;

import exercise.ex07.classe.PessoaClasse;

public class PessoaMain {
    public static void main(String[] args) {
        PessoaClasse pessoa = new PessoaClasse();

        pessoa.setNome("Erik");
        System.out.println(pessoa.getNome());
    }
}
