package exercise.pacote02.ex11.classe;

public class ContaPoupanca extends Conta {
    private double rendimentoPercentual;

    public ContaPoupanca(String numero, String titular, double rendimentoPercentual) {
        super(numero, titular);
        this.rendimentoPercentual = rendimentoPercentual;
    }

    @Override
    public void aplicarTaxaMensal() {
        this.saldo += this.saldo * this.rendimentoPercentual;
    }

    public double getRendimentoPercentual() {
        return this.rendimentoPercentual;
    }
}
