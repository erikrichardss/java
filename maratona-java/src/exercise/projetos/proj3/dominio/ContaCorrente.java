package exercise.projetos.proj3.dominio;

import exercise.projetos.proj3.repositorio.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    private double limite;

    public ContaCorrente(Cliente cliente, String numero) {
        super(cliente, numero);
        this.limite = 1000;
    }

    @Override
    public void sacar(double valor) {

        double taxa = calcularTaxa();
        double valorTotal = valor + taxa;

        double limiteFinal = this.cliente.getTipoCliente().limite(this.limite);

        if (this.saldo + limiteFinal >= valorTotal) {
            saldo -= valorTotal;
            System.out.println("Saque realizado: " + valor);
            System.out.println("Taxa: " + taxa);
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    @Override
    public double calcularTaxa() {
        return 5.0;
    }
}
