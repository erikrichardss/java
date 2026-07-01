package exercise.pacote03.ex02.domain;

public enum Status {
    CREATED("Created"),
    PAYING("Paying"),
    PREPARING("Preparing"),
    SHIPPING("Shipping"),
    COMPLETED("Completed");

    private final String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
