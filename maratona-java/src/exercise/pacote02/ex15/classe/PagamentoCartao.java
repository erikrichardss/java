package exercise.pacote02.ex15.classe;

public class PagamentoCartao implements Pagamento {
    private String numeroCartao;
    private boolean concluido;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
        this.concluido = false;
    }

    @Override
    public void processar(double valor) {
        if (valor > 0) {
            this.concluido = true;
        } else {
            System.out.println("É preciso ter um valor.");
            return;
        }
    }

    @Override
    public void cancelar() {
        if (this.concluido != false) {
            this.concluido = false;
        } else {
            System.out.println("O pagamento não foi concluido");
            return;
        }
    }

    @Override
    public boolean estarConcluido() {
        return isConcluido();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public boolean isConcluido() {
        return concluido;
    }
}
