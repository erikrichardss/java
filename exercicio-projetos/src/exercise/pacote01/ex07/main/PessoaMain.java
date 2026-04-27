package exercise.pacote01.ex07.main;

import exercise.pacote01.ex07.classe.PessoaClasse;

public class PessoaMain {
    public static void main(String[] args) {
        PessoaClasse pessoa = new PessoaClasse();

        pessoa.setNome("Erik");
        System.out.println(pessoa.getNome());
    }
}
