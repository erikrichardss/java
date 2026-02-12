package exercise.ex16.classe;

public class CalculadoraClass {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static boolean isPar(int numero) {
        if (numero %2 == 0) {
            return true;
        }
        return false;
    }
}