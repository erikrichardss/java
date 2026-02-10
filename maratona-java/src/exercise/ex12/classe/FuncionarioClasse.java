package exercise.ex12.classe;

public class FuncionarioClasse {
    private String nome;
    private double salario;

    public FuncionarioClasse(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public FuncionarioClasse(String nome) {
        this(nome, 1500.00);
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalario() {
        return this.salario;
    }
}
