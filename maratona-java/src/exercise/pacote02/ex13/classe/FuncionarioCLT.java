package exercise.pacote02.ex13.classe;

public class FuncionarioCLT extends Funcionario {
    private double discontoINCSS;

    public FuncionarioCLT(String nome, String cpf, double salarioBase, double discontoINCSS) {
        super(nome, cpf, salarioBase);
        this.discontoINCSS = discontoINCSS;
    }

    @Override
    public void calcularSalarioFinal() {
        System.out.printf(", salario final: %.2f \n", this.salarioBase -= this.discontoINCSS);
    }

    public double getDiscontoINCSS() {
        return discontoINCSS;
    }
}
