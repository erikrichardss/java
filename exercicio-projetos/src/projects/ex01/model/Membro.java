package projects.ex01.model;

import projects.ex01.enums.TipoPlano;

import java.time.LocalDate;

public class Membro {

    private LocalDate dataAdesao;
    private LocalDate dataExpiracao;
    private TipoPlano tipoPlano;
    private String nome;
    private String email;

    public Membro(String nome, String email, TipoPlano tipoPlano) {

        this.nome = nome;

        if (email.contains("@")) {

            this.email = email;
        } else {

            throw new RuntimeException("Email Inválido");
        }

        this.tipoPlano = tipoPlano;
        this.dataAdesao = LocalDate.now();
        this.dataExpiracao = dataAdesao.plusMonths(tipoPlano.getDuracaoMeses());
    }

    public LocalDate getDataAdesao() {
        return dataAdesao;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public TipoPlano getTipoPlano() {
        return tipoPlano;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
