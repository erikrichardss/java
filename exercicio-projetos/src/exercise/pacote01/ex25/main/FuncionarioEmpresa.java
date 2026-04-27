package exercise.pacote01.ex25.main;

import exercise.pacote01.ex25.classe.Empresa;
import exercise.pacote01.ex25.classe.Funcionario;

public class FuncionarioEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("TecSwiTH");
        Empresa empresa2 = new Empresa("InovaSwiTH");

        Funcionario funcionario1 = new Funcionario("Erik", 12872.98, empresa);
        Funcionario funcionario2 = new Funcionario("Ana", 4242.98, empresa);

        funcionario1.exibirDados();
        funcionario2.exibirDados();

        funcionario2.transferirEmpresa(empresa2);

        System.out.println("Após transferencia!");

        funcionario2.exibirDados();

    }
}
