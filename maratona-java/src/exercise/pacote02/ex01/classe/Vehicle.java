package exercise.pacote02.ex01.classe;

public class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void print() {
        System.out.println(getBrand());
        System.out.println(getYear());
    }

    public String getBrand() { return this.brand; }

    public int getYear() { return this.year; }
}
