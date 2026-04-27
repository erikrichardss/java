package projects.ex03.main;

import projects.ex03.domain.Tarefa;
import projects.ex03.enums.Prioridade;
import projects.ex03.exception.PrazoInvalidoException;

public class ControleDeTarefas {

    public static void main(String[] args) {

        criarTarefa();
    }

    public static void criarTarefa() {

        try {

            Tarefa tarefa = new Tarefa("Arrumar casa", "Precisa estar limpa", Prioridade.ALTA, "20/04/2026");

            tarefa.concluirTarefa();

            System.out.println(tarefa.calcularAtrazado());
            System.out.println(tarefa.toString());
        } catch (PrazoInvalidoException e) {

            e.printStackTrace();
        }
    }
}
