package exercise.pacote02.ex03.classe;

public class PixPayment extends Payment {

    private String pixKey;

    public PixPayment(double amount, String pixKey) {

        super(amount);
        this.pixKey = pixKey;
    }

    public void processPayment() {

        super.processPayment();
        System.out.println("PIX key: " + getPixKey());
    }

    public String getPixKey() { return this.pixKey; }
}
