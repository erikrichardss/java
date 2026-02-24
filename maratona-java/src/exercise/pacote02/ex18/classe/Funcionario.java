package exercise.pacote02.ex18.classe;

public class Funcionario {
    private String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return getSalarioBase();
    }

    public void exibirDados() {
        System.out.println("Nome: " + getNome() +
                ", salario final: " + calcularSalario());
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
