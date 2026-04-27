package exercise.pacote01.ex26.main;

import exercise.pacote01.ex26.classe.Carro;
import exercise.pacote01.ex26.classe.Motor;

public class MotorCarro {
    public static void main(String[] args) {
        Motor motor = new Motor("Gasolina", 390);
        Carro carro = new Carro("Fusca", motor);

        carro.imprimirCarro();
    }
}
