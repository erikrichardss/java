package exercise.pacote02.ex13.main;

import exercise.pacote02.ex13.classe.FuncionarioCLT;
import exercise.pacote02.ex13.classe.FuncionarioPJ;

public class FuncionarioTest {
    public static void main(String[] args) {
        FuncionarioCLT funcionarioCLT = new FuncionarioCLT("Erik", "12782141-12", 3870, 290);
        FuncionarioPJ funcionarioPJ = new FuncionarioPJ("Erika", "198621-12", 6712, 05);

        funcionarioCLT.exibirDadosFuncionario();
        funcionarioCLT.calcularSalarioFinal();

        funcionarioPJ.exibirDadosFuncionario();
        funcionarioPJ.calcularSalarioFinal();
    }
}
