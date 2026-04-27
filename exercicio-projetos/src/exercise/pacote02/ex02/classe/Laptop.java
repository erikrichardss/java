package exercise.pacote02.ex02.classe;

public class Laptop extends Device {
    private double screenSize;

    public Laptop(String model, String manufactuer, double screenSize) {
        super(model, manufactuer);
        this.screenSize = screenSize;
    }

    public void print() {
        super.print();
        System.out.println("Screen Size: " + getScreenSize());
    }

    public double getScreenSize() { return screenSize; }
}
