package exercise.pacote02.ex09.main;

import exercise.pacote02.ex09.classe.MetodoPagamento;
import exercise.pacote02.ex09.classe.Pagamento;

public class PagamentoTest {
    public static void main(String[] args) {
        Pagamento pagamento1 = new Pagamento(2200.00, MetodoPagamento.PIX);
        Pagamento pagamento2 = new Pagamento(2200.00, MetodoPagamento.CARTAO_CREDITO);
        Pagamento pagamento3 = new Pagamento(2200.00, MetodoPagamento.BOLETO);
        Pagamento pagamento4 = new Pagamento(2200.00, MetodoPagamento.DINHEIRO);

        System.out.println("Total pagamentos: " + Pagamento.getTotalPagamento());

        pagamento1.exibirResumo();
        pagamento2.exibirResumo();
        pagamento3.exibirResumo();
        pagamento4.exibirResumo();

        System.out.println(MetodoPagamento.tipoNomeMetodoPagamento("piX"));
    }
}
