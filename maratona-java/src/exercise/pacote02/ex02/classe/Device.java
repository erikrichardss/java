package exercise.pacote02.ex02.classe;

public class Device {
    protected String model;
    protected String manufacturer;

    public Device(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public void print() {
        System.out.println("Model: " + getModel());
        System.out.println("Manufacturer: " + getManufacturer());
    }

    public String getModel() { return this.model; }

    public String getManufacturer() { return this.manufacturer; }
}
