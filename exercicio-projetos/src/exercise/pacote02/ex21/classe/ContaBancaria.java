package exercise.pacote02.ex21.classe;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws Exception {
        if (valor <= 0 ) {
            throw new RuntimeException("Impossível sacar valores iguais ou menoes que zero");
        }

        if (valor > this.saldo) {
            throw new Exception("Saldo insuficiente");
        }

        this.saldo -= valor;
        System.out.println("Saldo realizado");
    }

    public double getSaldo() { return this.saldo; }
}
