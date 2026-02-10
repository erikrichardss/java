package exercise.ex12.main;

import exercise.ex12.classe.FuncionarioClasse;

public class Funcionario {
    public static void main(String[] args) {
        FuncionarioClasse funcionario = new FuncionarioClasse("Erik", 2526.98);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());
    }
}
