package exercise.pacote02.ex18.main;

import exercise.pacote02.ex18.classe.Desenvolvedor;
import exercise.pacote02.ex18.classe.Estagiario;
import exercise.pacote02.ex18.classe.Funcionario;
import exercise.pacote02.ex18.classe.Gerente;
import exercise.pacote02.ex18.servico.FolhaPagamento;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Lucas", 5700, 1200);
        Funcionario desenvolvedor = new Desenvolvedor("Erik", 5500, 700);
        Funcionario estagiario = new Estagiario("Marina", 1700);
        Funcionario[] funcionarios = {gerente, desenvolvedor, estagiario};

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
        }

        FolhaPagamento.calcularFolhaPagamento(funcionarios);
    }
}
