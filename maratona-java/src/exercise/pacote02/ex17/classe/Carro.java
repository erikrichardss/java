package exercise.pacote02.ex17.classe;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, int ano, int numeroPortas) {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularSeguro() {
        return super.calcularSeguro() + 500;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }
}
