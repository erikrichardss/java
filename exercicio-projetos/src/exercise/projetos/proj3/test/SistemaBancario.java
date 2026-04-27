package exercise.projetos.proj3.test;

import exercise.projetos.proj3.dominio.Cliente;
import exercise.projetos.proj3.dominio.ContaCorrente;
import exercise.projetos.proj3.dominio.ContaPoupanca;
import exercise.projetos.proj3.repositorio.TipoCliente;
import exercise.projetos.proj3.servico.Banco;

public class SistemaBancario {
    public static void main(String[] args) {
        Cliente erik = new Cliente("Erik", "19741-732", TipoCliente.VIP);
        Cliente joana = new Cliente("Joana", "87641-732", TipoCliente.COMUM);

        ContaCorrente cc = new ContaCorrente(erik, "001");
        ContaPoupanca cp = new ContaPoupanca(erik, "002");

        Banco banco = new Banco();
        banco.adicionarCliente(erik);
        banco.adicionarCliente(joana);

        cc.depositar(1000);

        System.out.println("----- SAQUE -----");
        cc.sacar(200);

        System.out.println("----- TRANSFERÊNCIA -----");
        banco.transferir(cc, cp, 300);

        System.out.println("Saldo final CC: " + cc.getSaldo());
        System.out.println("Saldo final CP: " + cp.getSaldo());
    }
}
