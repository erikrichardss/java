package exercise.pacote02.ex15.classe;

public class SistemaPagamento {
    private static int totalTransacoes;

    public void executarPagamento(Pagamento pagamento, double valor) {
        pagamento.processar(valor);
        SistemaPagamento.totalTransacoes++;
        pagamento.estarConcluido();
    }

    public static int getTotalTransacoes() {
        return totalTransacoes;
    }
}
