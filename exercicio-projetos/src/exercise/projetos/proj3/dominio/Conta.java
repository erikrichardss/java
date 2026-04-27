package exercise.projetos.proj3.dominio;

import exercise.projetos.proj3.servico.Transacao;

public abstract class Conta {
    protected String numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente, String numero) {
        this.cliente = cliente;
        this.numero = numero;
    }

    public abstract void sacar(double valor);

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depositado: " + valor);
        }
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
