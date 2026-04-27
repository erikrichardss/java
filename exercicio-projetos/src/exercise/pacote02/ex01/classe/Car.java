package exercise.pacote02.ex01.classe;

public class Car extends Vehicle{
    private int doors;

    public Car(String brand, int year, int doors) {
        super(brand, year);
        this.doors = doors;
    }

    public void print() {
        super.print();
        System.out.println(getDoors());
    }

    public int getDoors() { return this.doors; }
}
