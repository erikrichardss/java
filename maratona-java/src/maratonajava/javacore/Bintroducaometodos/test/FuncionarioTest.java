package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Erik";
        funcionario.idade = 18;
        funcionario.salario = new double[] {1999.87, 2835.98, 3486.98};

        funcionario.imprimirDados();
        funcionario.mediaDosSalarios();
    }
}
