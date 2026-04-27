package exercise.pacote02.ex03.classe;

public class Payment {

    private double amount;

    public Payment(double amount) { this.amount = amount; }

    public void processPayment() {

        System.out.println("Processing generic payment of: " + getAmount());
    }

    public double getAmount() { return this.amount; }
}
