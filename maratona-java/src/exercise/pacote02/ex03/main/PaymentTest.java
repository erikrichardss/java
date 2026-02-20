package exercise.pacote02.ex03.main;

import exercise.pacote02.ex03.classe.CreditCardPayment;
import exercise.pacote02.ex03.classe.Payment;
import exercise.pacote02.ex03.classe.PixPayment;

public class PaymentTest {

    public static void main(String[] args) {
        Payment payment = new Payment(98.90);
        Payment creditCardPayment = new CreditCardPayment(238.90, "(51) 98 9656-342");
        Payment pixPayment = new PixPayment(75.90, "newuser@hotmail.com");

        payment.processPayment();
        creditCardPayment.processPayment();
        pixPayment.processPayment();
    }
}
