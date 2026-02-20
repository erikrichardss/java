package exercise.pacote02.ex01.classe;

public class Motorcycle extends Vehicle {
    private int engineCapacity;

    public Motorcycle(String brand, int year, int engineCapacity) {
        super(brand, year);
        this.engineCapacity = engineCapacity;
    }

    public void print() {
        super.print();
        System.out.println(getEngineCapacity());
    }

    public int getEngineCapacity() { return this.engineCapacity; }
}
