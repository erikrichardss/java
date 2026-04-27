package projects.ex05.enums;

public enum TipoPagamento {

    PIX ("Pix"),
    CARTAO ("Cartão"),
    DINHEIRO ("Dinheiro");

    private String nomeTipoPagamento;

    TipoPagamento(String nomeTipoPagamento) {

        this.nomeTipoPagamento = nomeTipoPagamento;
    }

    public String getNomeTipoPagamento() {
        return nomeTipoPagamento;
    }
}
