package exercise.pacote02.ex02.classe;

public class Smartphone extends Device {
    private int storage;

    public Smartphone(String model, String manufacturer, int storage) {
        super(model, manufacturer);
        this.storage = storage;
    }

    public void print() {
        super.print();
        System.out.println(getStorage() + "GB");
    }

    public int getStorage() { return this.storage; }
}
