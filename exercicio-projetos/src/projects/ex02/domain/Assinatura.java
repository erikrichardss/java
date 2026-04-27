package projects.ex02.domain;

import projects.ex02.enums.TipoPlano;
import projects.ex02.exception.AssinaturaExpiradaException;
import projects.ex02.interfaces.Cobravel;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Assinatura implements Cobravel {

    private Usuario usuario;
    private TipoPlano tipoPlano;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorAssinatura;
    private boolean isAssinaturaAtiva;
    private boolean isAcessoAoSistema;

    public Assinatura(Usuario usuario, TipoPlano tipoPlano) {

        this.usuario = usuario;
        this.tipoPlano = tipoPlano;
        this.dataInicio = LocalDate.now();
        this.dataFim = dataInicio.minusDays(7);
        this.isAssinaturaAtiva = true;
    }

    @Override
    public double calcularValor() {

        if (tipoPlano == TipoPlano.PREMIUM) {

            this.valorAssinatura = TipoPlano.PREMIUM.getPreco();
            return this.valorAssinatura;
        }

        if (tipoPlano == TipoPlano.VIP) {

            this.valorAssinatura = TipoPlano.VIP.getPreco();
            return this.valorAssinatura;
        }

        this.valorAssinatura = TipoPlano.BASICO.getPreco();
        return this.valorAssinatura;
    }

    public void verificarStatusAssinatura() {

        if (LocalDate.now().isAfter(this.dataFim)) {

            this.isAssinaturaAtiva = false;
        }
    }

    public void acessoAoSistema() {

        verificarStatusAssinatura();

        if (!isAssinaturaAtiva) {

            this.isAcessoAoSistema = false;
            throw new AssinaturaExpiradaException("Assinatura expirada!");
        }

        this.isAcessoAoSistema = true;
    }


    public void renovarAssinatura() {

        verificarStatusAssinatura();

        if (!this.isAssinaturaAtiva) {

            this.dataInicio = LocalDate.now();
            this.dataFim = dataInicio.plusDays(30);
            this.isAssinaturaAtiva = true;
            acessoAoSistema();
        }
    }

    public long calcularVencimento() {

        long dias = ChronoUnit.DAYS.between(this.dataInicio.atStartOfDay(), this.dataFim.atStartOfDay());
        return dias;
    }

    public void imprimirUsuario() {

        System.out.println("Usuario: " + getUsuario().getNome() +
                " - Valor plano: " + calcularValor() +
                " - Status Assinatura: " + isAssinaturaAtiva +
                " - Acesso ao Sistema: " + isAcessoAoSistema() +
                " - Dias restantes: " + calcularVencimento());
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

    public LocalDate getDataFim() {
        return dataFim;
    }

    public double getValorAssinatura() {
        return valorAssinatura;
    }

    public boolean isAssinaturaAtiva() {
        return isAssinaturaAtiva;
    }

    public boolean isAcessoAoSistema() {
        return isAcessoAoSistema;
    }
}
