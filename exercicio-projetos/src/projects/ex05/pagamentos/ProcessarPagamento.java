package projects.ex05.pagamentos;

import projects.ex05.enums.TipoPagamento;

public class ProcessarPagamento {

    private PagamentoPix pagamentoPix;
    private PagamentoCartao pagamentoCartao;
    private PagamentoDinheiro pagamentoDinheiro;

    {

        this.pagamentoPix = new PagamentoPix();
        this.pagamentoCartao = new PagamentoCartao();
        this.pagamentoDinheiro = new PagamentoDinheiro();
    }

    public void processarPagamento(TipoPagamento tipoPagamento, double valor) {

        if (tipoPagamento == TipoPagamento.CARTAO) {

            pagamentoCartao.processarPagamento(valor);
        }

        if (tipoPagamento == TipoPagamento.PIX) {

            pagamentoPix.processarPagamento(valor);
        }

        if (tipoPagamento == TipoPagamento.DINHEIRO) {

            pagamentoDinheiro.processarPagamento(valor);
        }
    }

    public PagamentoPix getPagamentoPix() {
        return pagamentoPix;
    }

    public PagamentoCartao getPagamentoCartao() {
        return pagamentoCartao;
    }

    public PagamentoDinheiro getPagamentoDinheiro() {
        return pagamentoDinheiro;
    }
}
