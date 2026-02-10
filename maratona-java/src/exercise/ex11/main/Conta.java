package exercise.ex11.main;

import exercise.ex11.classe.ContaClasse;

public class Conta {
    public static void main(String[] args) {
        ContaClasse conta = new ContaClasse(100);

        System.out.println(conta.getSaldo());
    }
}
