package exercise.pacote02.ex18.classe;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() - 200;
    }
}
