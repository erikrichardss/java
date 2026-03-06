package exercise.pacote02.ex20.classe;

import exercise.pacote02.ex20.repositorio.Imposto;

public class ImpostoIms implements Imposto {
    private double percentual;

    public ImpostoIms() {
        this.percentual = 0.10;
    }

    @Override
    public double calcular(double valor) {
        return valor * this.percentual;
    }

    @Override
    public String getDescricao() {
        return "Imposto IMS";
    }

    public double getPercentual() {
        return percentual;
    }
}
