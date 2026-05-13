package maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {

    public static void main(String[] args) {

        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatoList = List.of(new Gato(), new Gato());
        printConsulta(cachorros);
        printConsulta(gatoList);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    private static void printConsulta(List<? extends Animal> animals) {

        for (Animal animal : animals) {

            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List<? super Animal> animals) {

        Animal animal = new Cachorro();
        Animal animal1 = new Gato();
    }
}
