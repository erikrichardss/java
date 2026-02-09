package exercise.ex06.objeto;

import exercise.ex06.classe.ContaBancariaClasse;

public class ContaBancaria {
    public static void main(String[] args) {
        ContaBancariaClasse contaBancaria = new ContaBancariaClasse();

        contaBancaria.depositar(100);
        System.out.println(contaBancaria.getSaldo());

        contaBancaria.depositar(-100);
        System.out.println(contaBancaria.getSaldo());
    }
}
