package exercise.pacote02.ex05.classe;

public class Product {
    private final String ID;
    private String name;

    public Product(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() { return this.ID; }

    public String getName() { return this.name; }
}
