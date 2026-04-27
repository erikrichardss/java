package exercise.pacote02.ex10.main;

import exercise.pacote02.ex10.classe.Circulo;
import exercise.pacote02.ex10.classe.Retangulo;

public class FormaTest {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("Circulo", "Azul", 13.0);
        Retangulo retangulo = new Retangulo("Retangulo", "Vermelho", 2.0, 6.0);

        circulo.exibirInformacao();

        retangulo.exibirInformacao();
        }
}
