package exercise.projetos.proj3.dominio;

public class ContaPoupanca extends Conta {
    private double juros;

    public ContaPoupanca(Cliente cliente, String numero) {
        super(cliente, numero);
        this.juros = 0.05;
    }

    @Override
    public void sacar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado: " + valor);
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void renderJuros() {
        double rendimento = this.saldo * this.juros;
        this.saldo += rendimento;

        System.out.println("Rendimento: " + rendimento);
        System.out.println("Saldo atualizado: " + saldo);
    }

    public double getJuros() {
        return juros;
    }
}
