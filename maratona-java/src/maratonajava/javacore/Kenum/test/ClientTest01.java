package maratonajava.javacore.Kenum.test;

import Cliente.TipoPagamento.CREDITO;
import maratonajava.javacore.Kenum.dominio.Cliente;
import maratonajava.javacore.Kenum.dominio.TipoCliente;
import maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClientTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Hardin", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Madalena", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.CREDITO.tipoPagamento(100));
        System.out.println(TipoPagamento.DEBITO.tipoPagamento(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);
    }
}
