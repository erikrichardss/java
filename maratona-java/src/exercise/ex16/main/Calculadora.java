package exercise.ex16.main;

import exercise.ex16.classe.CalculadoraClass;

public class Calculadora {
    public static void main(String[] args) {
        int somarResultado = CalculadoraClass.somar(34, 34);
        int multiplicaResultado = CalculadoraClass.multiplicar(34, 34);
        boolean isParSoma = CalculadoraClass.isPar(somarResultado);
        boolean isParMultiplica = CalculadoraClass.isPar(multiplicaResultado);

        System.out.println(somarResultado);
        System.out.println(isParSoma);

        System.out.println();

        System.out.println(multiplicaResultado);
        System.out.println(isParMultiplica);
    }
}
