package exercise.pacote02.ex16.classe;

public class Plano {
    private String nome;
    private double valorMensal;
    private int limiteTelas;

    public Plano(String nome, double valorMensal, int limiteTelas) {
        this.nome = nome;
        this.valorMensal = valorMensal;
        this.limiteTelas = limiteTelas;
    }

    public String getNome() {
        return nome;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public int getLimiteTelas() {
        return limiteTelas;
    }
}
