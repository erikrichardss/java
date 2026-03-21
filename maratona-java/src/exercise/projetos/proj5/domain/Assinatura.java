package exercise.projetos.proj5.domain;

import exercise.projetos.proj5.enums.StatusPlano;
import exercise.projetos.proj5.enums.TipoPlano;
import exercise.projetos.proj5.exceptions.AssinaturaExpiradaException;
import exercise.projetos.proj5.interfaces.Cobravel;

import java.time.LocalDate;

public class Assinatura implements Cobravel {

    private Usuario usuario;
    private TipoPlano tipoPlano;
    private StatusPlano statusPlano;
    private LocalDate dataInicio;
    private LocalDate datafim;

    public Assinatura(Usuario usuario, TipoPlano tipoPlano) {
        this.usuario = usuario;
        this.tipoPlano = tipoPlano;
        this.statusPlano = StatusPlano.ATIVO;

        dataInicio = LocalDate.now();
        datafim = dataInicio.plusDays(30);
    }

    @Override
    public double calcularValor() {
        return getTipoPlano().getPrecoPlano();
    }

    public boolean verificacaoStatusAssinatura() {

        if (LocalDate.now().isAfter(datafim)) {
            this.statusPlano = StatusPlano.EXPIRADO;

            System.out.println(dataInicio.isBefore(datafim));
        }

        return LocalDate.now().isBefore(datafim);
    }

    public void alterarDatasParaTeste(LocalDate inicio) {
        this.dataInicio = inicio;

        this.datafim = this.dataInicio.plusDays(30);
    }

    public boolean acessoAoSistema() {
        if (LocalDate.now().isAfter(datafim)) {
            throw new AssinaturaExpiradaException("Assinatura expirada");
        }

        return true;
    }

    public void renovarAssinatura(double valor) {

        if (LocalDate.now().isAfter(getDatafim())) {

            if (valor == getTipoPlano().getPrecoPlano()) {
                this.statusPlano = StatusPlano.ATIVO;

                this.dataInicio = LocalDate.now();
                this.datafim = dataInicio.plusDays(30);
            } else {
                throw new IllegalArgumentException("Valor inválido");
            }
        }
    }

    public void imprimirRelatorio() {
        System.out.println("Usuario: " + getUsuario().getNome() +
                ", plano: " + getTipoPlano().getPlano() +
                ", preco: " + calcularValor() +
                ", inicio: " + getDataInicio() +
                ", termino: " + getDatafim() +
                ", status: " + getStatusPlano().getStatus());
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoPlano getTipoPlano() {
        return tipoPlano;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDatafim() {
        return datafim;
    }

    public StatusPlano getStatusPlano() {
        return statusPlano;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}
