package exercise.pacote02.ex01.main;

import exercise.pacote02.ex01.classe.Car;
import exercise.pacote02.ex01.classe.Motorcycle;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, 4);
        Car car2 = new Car("Volkswagen Polo", 2025, 4);

        Motorcycle motorcycle = new Motorcycle("Honda", 2021, 300);
        Motorcycle motorcycle2 = new Motorcycle("Titan", 2019, 290);

        System.out.println(" Car \n");
        car.print();
        System.out.println("---------");
        car2.print();

        System.out.println("\n Motocycle");
        motorcycle.print();
        System.out.println("---------");
        motorcycle2.print();
    }
}
