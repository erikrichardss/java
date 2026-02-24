package exercise.pacote02.ex15.main;

import exercise.pacote02.ex15.classe.PagamentoCartao;
import exercise.pacote02.ex15.classe.PagamentoPix;
import exercise.pacote02.ex15.classe.SistemaPagamento;

public class PagamentoTest {
    public static void main(String[] args) {
        PagamentoCartao pagamentoCartao = new PagamentoCartao("1-240974");

        PagamentoPix pagamentoPix = new PagamentoPix("98162-2398");

        SistemaPagamento sistemaPagamento = new SistemaPagamento();

        pagamentoCartao.processar(300);
        System.out.println(pagamentoCartao.estarConcluido());

        pagamentoPix.processar(11);
        System.out.println(pagamentoPix.estarConcluido());

        sistemaPagamento.executarPagamento(pagamentoCartao, 300);
        System.out.println(SistemaPagamento.getTotalTransacoes());
    }
}
