package exercise.projetos.proj5.enums;

public enum TipoPlano {

    BASICO ("Básico", 20),
    PREMIUM ("Premium", 40);

    private String plano;
    private double precoPlano;

    TipoPlano(String plano, double precoPlano) {
        this.plano = plano;
        this.precoPlano = precoPlano;
    }

    public String getPlano() {
        return plano;
    }

    public double getPrecoPlano() {
        return precoPlano;
    }
}
