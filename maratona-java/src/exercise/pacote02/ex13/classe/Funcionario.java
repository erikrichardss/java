package exercise.pacote02.ex13.classe;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    protected double salarioBase;
    private static int totalFuncionarios;

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        Funcionario.totalFuncionarios++;
    }

    public abstract void calcularSalarioFinal();

    public void exibirDadosFuncionario() {
        System.out.print("Nome: " + getNome() +
                ", cpf: " + getCpf() +
                ", salario base: " + getSalarioBase());
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public static int getTotalFuncionarios() {
        return totalFuncionarios;
    }
}
