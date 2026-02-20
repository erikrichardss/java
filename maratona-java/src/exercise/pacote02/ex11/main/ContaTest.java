package exercise.pacote02.ex11.main;

import exercise.pacote02.ex11.classe.ContaCorrente;
import exercise.pacote02.ex11.classe.ContaPoupanca;

public class ContaTest {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("14423", "Erik", 9.90);
        ContaPoupanca contaPoupanca = new ContaPoupanca("2132", "Kamila", 0.02);

        contaCorrente.depositar(7000.90);
        contaCorrente.sacar(2560.40);
        contaCorrente.aplicarTaxaMensal();
        contaCorrente.exibirResumo();

        contaPoupanca.depositar(2000);
        contaPoupanca.sacar(128.90);
        contaPoupanca.aplicarTaxaMensal();
        contaPoupanca.exibirResumo();

    }
}
