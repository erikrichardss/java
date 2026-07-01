package projects.ex09.domain;

public class User {

    private int id = 0;
    private String name;
    private int quantityLoanByUsers = 0;

    public User(String name) {
        this.id++;
        quantityLoanByUsers++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityLoanByUsers=" + quantityLoanByUsers +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantityLoanByUsers() { return quantityLoanByUsers; }
}
