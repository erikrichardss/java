package maratonajava.javacore.Bintroducaometodos.test;

import maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioResolucao;

public class FuncionarioTestResolucao {
    public static void main(String[] args) {
        FuncionarioResolucao funcionario = new FuncionarioResolucao();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);;
        funcionario.setSalarios(new double[] {1200, 987.32, 2000});

        funcionario.imprime();
    }
}
