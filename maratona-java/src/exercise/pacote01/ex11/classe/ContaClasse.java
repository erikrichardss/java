package exercise.pacote01.ex11.classe;

public class ContaClasse {
    private double saldo;

    public ContaClasse(double saldo) {
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }


    }

    public double getSaldo() {
        return this.saldo;
    }
}
