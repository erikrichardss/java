package exercise.ex21.main;

import exercise.ex21.classe.Computator;
import exercise.ex21.classe.Teclado;

public class TecladoComputador {
    public static void main(String[] args) {
        Teclado teclado = new Teclado("HyperX", false);
        Computator computador = new Computator("Lenovo Slim 3", teclado);

        computador.exibirConfiguracao();
    }
}
