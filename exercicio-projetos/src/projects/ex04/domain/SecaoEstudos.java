package projects.ex04.domain;

import projects.ex04.enums.TipoEstudo;
import projects.ex04.exception.TempoInvalidoException;
import projects.ex04.interfaces.Calculavel;

import java.time.LocalDate;

public class SecaoEstudos implements Calculavel {

    private String descricao;
    private TipoEstudo tipoEstudo;
    private int duracaoEstudo;
    private LocalDate data;

    public SecaoEstudos(String descricao, TipoEstudo tipoEstudo, int duracaoEstudo) {

        this.descricao = descricao;
        this.tipoEstudo = tipoEstudo;

        if (duracaoEstudo <= 0) {

            throw new TempoInvalidoException("Tempo inválido");
        }

        this.duracaoEstudo = duracaoEstudo;
        this.data = LocalDate.now();
    }

    @Override
    public void calcularDuracao() {


    }

    @Override
    public String toString() {
        return "SecaoEstudos{" +
                " data=" + data +
                " tipoEstudo=" + tipoEstudo +
                "; descricao='" + descricao + '\'' +
                "; duracaoEstudo=" + duracaoEstudo +
                '}';
    }

    public String getDescricao() {
        return descricao;
    }

    public TipoEstudo getTipoEstudo() {
        return tipoEstudo;
    }

    public int getDuracaoEstudo() {
        return duracaoEstudo;
    }

    public LocalDate getData() {
        return data;
    }
}
