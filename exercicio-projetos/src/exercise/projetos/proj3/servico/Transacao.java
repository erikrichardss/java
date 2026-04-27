package exercise.projetos.proj3.servico;

import java.time.LocalDateTime;

public class Transacao {

    private String tipo;
    private LocalDateTime data;
    private double valor;
    private String descricao;

    public Transacao(String tipo, double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.descricao = descricao;
        this.data = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return data + " - " + tipo + " - R$" + valor + " - " + descricao;
    }
}