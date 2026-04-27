package projects.ex03.domain;

import projects.ex03.enums.Prioridade;
import projects.ex03.enums.StatusTarefa;
import projects.ex03.exception.PrazoInvalidoException;
import projects.ex03.exception.TarefaConcluidaException;
import projects.ex03.interfaces.Atrasavel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Tarefa implements Atrasavel {

    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private StatusTarefa statusTarefa;
    private LocalDate dataCriacao;
    private LocalDate dataEntrega;

    public Tarefa(String titulo, String descricao, Prioridade prioridade, String dataEntrega) {

        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.statusTarefa = StatusTarefa.PENDENTE;
        this.dataCriacao = LocalDate.now();

        try {

            DateTimeFormatter dataEntregaFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.dataEntrega = LocalDate.parse(dataEntrega, dataEntregaFormater);

            if (LocalDate.parse(dataEntrega, dataEntregaFormater).isBefore(this.dataCriacao)) {

                throw new PrazoInvalidoException("Data inválida");
            }
        } catch (DateTimeParseException e) {

            e.printStackTrace();
        }
    }

    public void concluirTarefa() {

        if (this.statusTarefa == StatusTarefa.CONCLUIDA) {

            throw new TarefaConcluidaException("Tarefa já concluida");
        }

        this.statusTarefa = StatusTarefa.CONCLUIDA;
    }

    @Override
    public long calcularAtrazado() {

        if (LocalDate.now().isAfter(this.dataEntrega)) {

            return ChronoUnit.DAYS.between(dataEntrega, dataCriacao);
        }

        if (LocalDate.now().isBefore(this.dataEntrega)) {

            return ChronoUnit.DAYS.between(dataCriacao, dataEntrega);
        }

        return 0;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", prioridade=" + prioridade.getNome() +
                ", statusTarefa=" + statusTarefa.getNome() +
                ", dataCriacao=" + dataCriacao +
                ", dataEntrega=" + dataEntrega +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public StatusTarefa getStatusTarefa() {
        return statusTarefa;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
}
