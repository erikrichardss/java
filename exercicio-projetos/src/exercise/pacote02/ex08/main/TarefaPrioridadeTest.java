package exercise.pacote02.ex08.main;

import exercise.pacote02.ex08.classe.Prioridade;
import exercise.pacote02.ex08.classe.Tarefa;

public class TarefaPrioridadeTest {
    public static void main(String[] args) {
        Tarefa tarefaUm = new Tarefa("Estoque quase no fim", Prioridade.BAIXA);
        Tarefa tarefaDois = new Tarefa("Vazamento no banheiro", Prioridade.MEDIA);
        Tarefa tarefaTres = new Tarefa("Suporte aos funcionários", Prioridade.ALTA);
        Tarefa tarefaQuatro = new Tarefa("Prejuizo nas cargas", Prioridade.CRITICA);

        System.out.println(tarefaUm);
        System.out.println(tarefaDois);
        System.out.println(tarefaTres);
        System.out.println(tarefaQuatro);

        System.out.println(Prioridade.porNivel(1));
    }
}
