package exercise.pacote01.ex25.classe;

public class Funcionario {
    private String nome;
    private double salario;
    private Empresa empresa;

    public Funcionario(String nome, double salario, Empresa empresa) {
        this.empresa = empresa;
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Funcionário: " + nome);

        if (empresa == null) { return; }
        System.out.println("Empresa: " + empresa.getNome());
        System.out.println("--------");
    }

    public void transferirEmpresa(Empresa novaEmpresa) { this.empresa = novaEmpresa; }

    public void setNome(String nome) { this.nome = nome;}

    public String getNome() { return nome; }

    public void setEmpresa(Empresa empresa) { this.empresa = empresa; }

    public Empresa getEmpresa() { return empresa; }
}
