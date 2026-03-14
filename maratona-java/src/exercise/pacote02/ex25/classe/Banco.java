package exercise.pacote02.ex25.classe;

import exercise.pacote02.ex25.exception.SaldoInsuficienteException;

import java.io.IOException;

public class Banco {
    public static void operarConta(Conta conta) {

        conta.depositar(200);
        conta.sacar(150);
        conta.sacar(750);
        conta.exibirDados();
    }

    public static void transferir(Conta origem, Conta destino, double valor) {

        if (destino == null) {
            throw new IllegalArgumentException("Erro: destino não existe");
        }

        destino.sacar(valor);
        destino.depositar(valor);
        destino.exibirDados();
    }
}
