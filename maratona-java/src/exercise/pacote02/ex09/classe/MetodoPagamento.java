package exercise.pacote02.ex09.classe;

public enum MetodoPagamento {
    PIX("Pix", 0.0, 1, false) {
        @Override
        public double calcularValorFinal(double valorBase) {
            return valorBase;
        }
    },
    CARTAO_CREDITO("Cartão de Crédito",2.5, 12, true) {
        @Override
        public double calcularValorFinal(double valorBase) {
            return valorBase += (valorBase * getTaxaPercentual()) / 100;
        }
    },
    BOLETO("Boleto", 1.0, 1, false) {
        @Override
        public double calcularValorFinal(double valorBase) {
            return valorBase += (valorBase * getTaxaPercentual()) / 100;
        }
    },
    DINHEIRO("Dinheiro", 0.0, 1, false) {
        @Override
        public double calcularValorFinal(double valorBase) {
            return valorBase;
        }
    };

    private String nomePagamento;
    private double taxaPercentual;
    private int maxParcelas;
    private boolean permiteParcelamento;

    MetodoPagamento(String nomePagamento, double taxaPercentual, int maxParcelas, boolean permiteParcelamento) {
        this.nomePagamento = nomePagamento;
        this.taxaPercentual = taxaPercentual;
        this.maxParcelas = maxParcelas;
        this.permiteParcelamento = permiteParcelamento;
    }

    public static MetodoPagamento tipoNomeMetodoPagamento(String nome) {
        for (MetodoPagamento nomePagamento : MetodoPagamento.values()) {
            if (nomePagamento.getNomePagamento().equalsIgnoreCase(nome)) {
                return nomePagamento;
            }
        }
        return null;
    }

    public abstract double calcularValorFinal(double valorbase);

    public String getNomePagamento() { return nomePagamento; }

    public double getTaxaPercentual() { return taxaPercentual; }

    public int getMaxParcelas() { return maxParcelas; }

    public boolean isPermiteParcelamento() { return permiteParcelamento; }
}
