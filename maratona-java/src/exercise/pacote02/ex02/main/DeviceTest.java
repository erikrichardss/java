package exercise.pacote02.ex02.main;

import exercise.pacote02.ex02.classe.Laptop;
import exercise.pacote02.ex02.classe.Smartphone;

public class DeviceTest {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("S20FE", "Samsung", 120);
        Laptop laptop = new Laptop("Lenovo Slim 3", "Lenovo", 25.6);

        System.out.println(" Smartphone");
        smartphone.print();

        System.out.println("-------------");

        System.out.println(" Laptop");
        laptop.print();
    }
}
