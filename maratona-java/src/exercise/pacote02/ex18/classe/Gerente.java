package exercise.pacote02.ex18.classe;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getBonus();
    }

    public double getBonus() {
        return bonus;
    }
}
