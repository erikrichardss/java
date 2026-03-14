package exercise.pacote02.ex25.classe;

import exercise.pacote02.ex25.exception.SaldoInsuficienteException;

public class Conta {
    private String titular;
    private int numeroConta;
    private double saldo;

    public Conta(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: passagem de número negativo");
        }

        System.out.println("Deposito concluido " + valor);
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Erro: valor negativo");
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Erro: saldo insuficiente");
        }

        System.out.println("Saque concluido " + valor);
        this.saldo -= valor;
    }

    public void exibirDados() {
        System.out.println("Titular: " + getTitular() +
                ", numero conta: " + getNumeroConta() +
                ", saldo: " + getSaldo());
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
}
