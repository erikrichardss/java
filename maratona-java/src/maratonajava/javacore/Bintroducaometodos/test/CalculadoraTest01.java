package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {

    static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando calculadora test.");
        calculadora.subtraiDoisNumeros();
    }
}
