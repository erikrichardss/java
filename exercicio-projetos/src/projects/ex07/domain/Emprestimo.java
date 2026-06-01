package projects.ex07.domain;

import projects.ex07.enums.StatusEmprestimo;
import projects.ex07.enums.TipoUsuario;
import projects.ex07.exceptions.MaterialIndisponivelException;
import projects.ex07.interfaces.Multavel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo implements Multavel {

    private Usuario usuario;
    private Material material;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private StatusEmprestimo statusEmprestimo;

    public Emprestimo(Usuario usuario, Material material) {

        this.usuario = usuario;
        this.material = material;
        this.dataEmprestimo = LocalDate.now();

        if (!material.isDisponivel()) throw new MaterialIndisponivelException("Material Indisponível");

        if (usuario.getTipoUsuario().equals(TipoUsuario.ALUNO)) {

            this.dataDevolucao = LocalDate.now().plusDays(7);
        }

        if (usuario.getTipoUsuario().equals(TipoUsuario.PROFESSOR)) {

            this.dataDevolucao = LocalDate.now().plusDays(14);
        }

        if (usuario.getTipoUsuario().equals(TipoUsuario.VISITANTE)) {

            this.dataDevolucao = LocalDate.now().plusDays(3);
        }
    }

    @Override
    public double calcularMulta() {

        return ChronoUnit.DAYS.between(LocalDate.now(), this.dataDevolucao) * 2;
    }

    @Override
    public String toString() {
        return "Emprestimo{" +
                "usuario=" + usuario +
                ", material=" + material +
                ", dataEmprestimo=" + dataEmprestimo +
                ", dataDevolucao=" + dataDevolucao +
                ", statusEmprestimo=" + statusEmprestimo +
                '}';
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Material getMaterial() {
        return material;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public StatusEmprestimo getStatusEmprestimo() {
        return statusEmprestimo;
    }
}
