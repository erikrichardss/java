package exercise.ex21.classe;

public class Computator {
    private String marca;
    private Teclado teclado;

    public Computator(String marca, Teclado teclado) {
        this.marca = marca;
        this.teclado = teclado;
    }

    public void exibirConfiguracao() {
        System.out.println("Modelo: " + this.marca);
        System.out.println("Marca: " + teclado.getmarca());
        System.out.println("É mecânico: " + teclado.getmecanico());
    }
}
