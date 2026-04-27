package exercise.pacote01.ex12.main;

import exercise.pacote01.ex12.classe.FuncionarioClasse;

public class Funcionario {
    public static void main(String[] args) {
        FuncionarioClasse funcionario = new FuncionarioClasse("Erik", 2526.98);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
    }
}
