package exercise.pacote02.ex20.classe;

import exercise.pacote02.ex20.repositorio.Imposto;

public class ImpostoRenda implements Imposto {
    private double aliquota;

    public ImpostoRenda() {
        this.aliquota = 0.15;
    }

    @Override
    public double calcular(double valor) {
        return valor * this.aliquota;
    }

    @Override
    public String getDescricao() {
        return "Imposto de renda";
    }
}
