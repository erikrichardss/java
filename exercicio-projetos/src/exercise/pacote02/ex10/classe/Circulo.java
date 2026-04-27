package exercise.pacote02.ex10.classe;

public class Circulo extends  Forma {
    private double raio;

    public Circulo(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        this.raio = Math.PI * (this.raio * this.raio);
        System.out.printf("Raio: %.2f \n", getRaio());
    }

    public double getRaio() {
        return raio;
    }
}
