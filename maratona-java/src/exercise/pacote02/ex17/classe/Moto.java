package exercise.pacote02.ex17.classe;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, int ano, int cilindradas) {
        super(modelo, ano);
    }

    @Override
    public double calcularSeguro() {
        return super.calcularSeguro() + 300;
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
