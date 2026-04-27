package exercise.pacote02.ex17.classe;

public class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public double calcularSeguro() {
        double valorBase = 1000;
        return valorBase;
    }

    public void exibirDados() {
        System.out.println("Modelo: " + getModelo() +
                ", ano: " + getAno() +
                ", seguro: " + calcularSeguro());
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
