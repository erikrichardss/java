package maratonajava.javacore.Aintroducaoclasses.test;

import maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Volkswagen";
        carro1.ano = 2018;
        carro1.modelo = "T-Cross";

        carro2.nome = "Mustang";
        carro2.ano = 1969;
        carro2.modelo = "GT 500";

        System.out.println("Carro 1 \n Nome: " + carro1.nome + "\n Modelo: " + carro1.modelo + "\n Ano: " + carro1.ano);
        System.out.println("\nCarro 2 \n Nome: " + carro2.nome + "\n Modelo: " + carro2.modelo + "\n Ano: " + carro2.ano);

    }
}
