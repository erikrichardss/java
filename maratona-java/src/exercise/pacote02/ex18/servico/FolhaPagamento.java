package exercise.pacote02.ex18.servico;

import exercise.pacote02.ex18.classe.Funcionario;

public class FolhaPagamento {
    public static void calcularFolhaPagamento(Funcionario[] funcionarios) {
        if (funcionarios == null) return;

        double calculoSalario = 0;
        for (Funcionario funcionario : funcionarios) {
            calculoSalario += funcionario.calcularSalario();
        }

        System.out.println("Folha de pagamento: " + calculoSalario);
    }
}
