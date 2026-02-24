package exercise.pacote02.ex13.classe;

public class FuncionarioPJ extends  Funcionario {
    private double percentualBonus;

    public FuncionarioPJ(String nome, String cpf, double salarioBase, double percentualBonus) {
        super(nome, cpf, salarioBase);
        this.percentualBonus = percentualBonus;
    }

    @Override
    public void calcularSalarioFinal() {
        System.out.printf(", salario final: %.2f \n", this.salarioBase += (this.salarioBase * this.percentualBonus) / 100);
    }

    public double getPercentualBonus() {
        return percentualBonus;
    }
}
