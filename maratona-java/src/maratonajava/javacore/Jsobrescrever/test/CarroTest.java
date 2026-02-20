package maratonajava.javacore.Jsobrescrever.test;

import maratonajava.javacore.Jsobrescrever.dominio.Carro;
import maratonajava.javacore.Jsobrescrever.dominio.Comprador;
import maratonajava.javacore.Jsobrescrever.dominio.Ferrari;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Erik");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
