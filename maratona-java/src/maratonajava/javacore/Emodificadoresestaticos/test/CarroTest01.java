package maratonajava.javacore.Emodificadoresestaticos.test;

import maratonajava.javacore.Emodificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180);;
        c1.imprive();
        c2.imprive();
        c3.imprive();
    }
}