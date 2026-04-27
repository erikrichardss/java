package exercise.pacote02.ex08.classe;

public class Tarefa {
    private String descricao;
    private Prioridade prioridade;
    private static int totalTarefas;

    public Tarefa(String descricao, Prioridade prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        Tarefa.totalTarefas++;
    }

    @Override
    public String toString() {
        return "Descrição: " + this.descricao +
                ", prioridade: " + this.prioridade +
                ", nivel de urgência: " + this.prioridade.getNivelDeUrgencia() +
                ", prazo em horas: " + this.prioridade.getPrazoEmHoras() +
                ", atendimento: " + this.prioridade.exigeAtendimentoImediato();
    }


}
