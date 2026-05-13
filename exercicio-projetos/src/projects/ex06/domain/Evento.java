package projects.ex06.domain;

import projects.ex06.enums.TipoEvento;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Evento {

    private String nome;
    private TipoEvento tipoEvento;
    private LocalDate data;
    private int capacidadeMaxima;
    private double valorInscricao;

    public Evento(String nome, TipoEvento tipoEvento, String data, int capacidadeMaxima, double valorInscricao) {

        this.nome = nome;
        this.tipoEvento = tipoEvento;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        this.data = LocalDate.parse(data, formatter);

        if (this.data.isBefore(LocalDate.now())) {

            throw new DateTimeException("Data Inválida");
        }

        if (capacidadeMaxima <= 0 || valorInscricao <= 0) {

            throw new IllegalArgumentException("Valor inválido");
        }
        this.capacidadeMaxima = capacidadeMaxima;
        this.valorInscricao = valorInscricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(data, evento.data);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", tipoEvento=" + tipoEvento.getNome() +
                ", data=" + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", capacidadeMaxima=" + capacidadeMaxima +
                ", valorInscricao=" + valorInscricao +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public LocalDate getData() {
        return data;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public double getValorInscricao() {
        return valorInscricao;
    }
}
