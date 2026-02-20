package exercise.pacote02.ex11.classe;

public abstract class Conta {
    protected String numero;
    protected String titular;
    protected double saldo;
    protected static int totalContas;

    public Conta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
        Conta.totalContas++;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else if (valor <= 0) {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            System.out.println("É preciso ter um saldo maior!");
        }
    }

    public abstract void aplicarTaxaMensal();

    public void exibirResumo() {
        System.out.print("Número: " + getNumero() +
                ", titular: " + getTitular());
        System.out.printf(", saldo: %.2f \n", getSaldo());
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getTotalContas() {
        return totalContas;
    }
}
