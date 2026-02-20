package exercise.pacote02.ex05.main;

import exercise.pacote02.ex05.classe.Animal;
import exercise.pacote02.ex05.classe.Dog;

public class AnimalTes {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.makeSound();
        Dog dog = new Dog();
        dog.setName("Incures");
    }
}
