package projects.ex02.enums;

public enum TipoPlano {

    BASICO(19.90),
    PREMIUM(39.90),
    VIP(59.90);

    private double preco;
    TipoPlano(double preco) {

        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}
