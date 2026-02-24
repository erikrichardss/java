package exercise.pacote02.ex18.classe;

public class Desenvolvedor extends Funcionario {
    private double adicionalProjeto;

    public Desenvolvedor(String nome, double salarioBase, double adicionalProjeto) {
        super(nome, salarioBase);
        this.adicionalProjeto = adicionalProjeto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getAdicionalProjeto();
    }

    public double getAdicionalProjeto() {
        return adicionalProjeto;
    }
}
