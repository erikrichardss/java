package exercise.pacote02.ex09.classe;

public class Pagamento {
    private double valor;
    private  MetodoPagamento metodoPagamento;
    private static int totalPagamento;

    public Pagamento(double valor, MetodoPagamento metodoPagamento) {
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        Pagamento.totalPagamento++;
    }

    public void exibirResumo() {
        System.out.println("Valor original: " + getValor() +
                ", metodo: " + metodoPagamento.getNomePagamento() +
                ", taxa aplicada: " + metodoPagamento.getTaxaPercentual() +
                ", valor final: " + metodoPagamento.calcularValorFinal(this.valor) +
                ", permite parcelamento: " + metodoPagamento.isPermiteParcelamento());
    }

    public double getValor() {
        return valor;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public static int getTotalPagamento() { return Pagamento.totalPagamento; }
}
