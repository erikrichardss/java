package exercise.pacote01.ex06.classe;

public class ContaBancariaClasse {
    private double saldo;

    public double depositar(double saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
            System.out.println("Depostio aprovado");
        } else {
            System.out.println("Valor indisponível para deposito");
        }

        return 0;
    }

    public double getSaldo() {
        return saldo;
    }
}
