package exercise.pacote02.ex10.classe;

public class Retangulo extends Forma {
    private double altura;
    private double largura;

    public Retangulo(String nome, String cor, double altura, double largura) {
        super(nome, cor);
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area: " + getLargura() * getAltura());
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }
}
