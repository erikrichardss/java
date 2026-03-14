package exercise.pacote02.ex24.classe;

import java.util.InputMismatchException;

public class Divisao {
    public static void main(String[] args) {
        double numero = 100;
        double divide = 0;

        try {
            double total = numero / divide;
            System.out.println(total);
        } catch (ArithmeticException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
