package projects.ex01.enums;

public enum TipoPlano {

    BASIC (80.00, 1),
    SILVER (200.00, 2),
    GOLD (700.00, 12);

    private double mensalidade;
    private int duracaoMeses;

    TipoPlano(double mensalidade, int duracaoMeses) {
        this.mensalidade = mensalidade;
        this.duracaoMeses = duracaoMeses;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public int getDuracaoMeses() {
        return duracaoMeses;
    }
}
