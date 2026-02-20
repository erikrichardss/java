package exercise.pacote02.ex03.classe;

public class CreditCardPayment extends Payment {

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {

        super(amount);
        this.cardNumber = cardNumber;
    }

    public void processPayment() {

        super.processPayment();
        System.out.println("Card Number: " + getCardNumber());
    }

    public String getCardNumber() { return this.cardNumber; }
}
