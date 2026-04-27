package exercise.pacote02.ex25.main;

import exercise.pacote02.ex25.classe.Banco;
import exercise.pacote02.ex25.classe.Conta;
import exercise.pacote02.ex25.exception.SaldoInsuficienteException;

public class Programa {
    public static void main(String[] args) {
        Conta conta = new Conta("Erik", 75612);
        Conta conta2 = new Conta("Emilia", 28713);

        try {
            Banco.operarConta(conta);
            conta.exibirDados();
            Banco.transferir(conta, conta2, 200);
        } catch (IllegalArgumentException | SaldoInsuficienteException e) {
            e.printStackTrace();
        }
    }
}
