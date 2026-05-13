package exercise.pacote02.ex27.classe;

import java.util.Objects;

public class Task {

    private String titulo;
    private int prioridade;
    private boolean concluida;

    public Task(String titulo, int prioridade, boolean concluida) {

        this.titulo = titulo;
        this.prioridade = prioridade;
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Task{" +
                "titulo='" + titulo + '\'' +
                ", prioridade=" + prioridade +
                ", concluida=" + concluida +
                '}';
    }



    public String getTitulo() {
        return titulo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }
}
