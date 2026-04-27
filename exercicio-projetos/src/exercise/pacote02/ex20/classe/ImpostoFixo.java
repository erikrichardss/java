package exercise.pacote02.ex20.classe;

import exercise.pacote02.ex20.repositorio.Imposto;

public class ImpostoFixo implements Imposto {
    private double valorFixo;

    public ImpostoFixo() {
        this.valorFixo = 0.20;
    }

    @Override
    public double calcular(double valor) {
        return valor * this.valorFixo;
    }

    @Override
    public String getDescricao() {
        return "Imposto fixo";
    }

    public double getValorFixo() {
        return valorFixo;
    }
}
