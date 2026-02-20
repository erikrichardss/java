package exercise.pacote02.ex11.classe;

public class ContaCorrente extends Conta {
    private double taxaMensal;

    public ContaCorrente(String numero, String titular, double taxaMensal) {
        super(numero, titular);
        this.taxaMensal = taxaMensal;
    }

    @Override
    public void aplicarTaxaMensal() {
        this.saldo -= this.taxaMensal;
    }

    public double getTaxaMensal() { return this.taxaMensal; }
}
