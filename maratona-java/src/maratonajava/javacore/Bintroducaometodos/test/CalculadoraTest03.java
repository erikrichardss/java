package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 2);

        System.out.println(result);
        System.out.println();
        System.out.println(calculadora.divideDoisNumeros02(30, 3));
        System.out.println("----------\n\n");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 5);
    }
}