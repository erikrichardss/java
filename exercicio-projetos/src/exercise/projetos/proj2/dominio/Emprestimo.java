package exercise.projetos.proj2.dominio;

import exercise.projetos.proj2.repositorio.Multavel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo implements Multavel {
    private Usuario usuario;
    private Material material;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevista;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Material material) {
        this.usuario = usuario;
        this.material = material;
        this.dataEmprestimo = LocalDate.now();
        this.dataPrevista = dataEmprestimo.plusDays(7);
    }

    public void criarEmprestimo(Material material) {
        if (usuario.isBloqueado()) {
            System.out.println("Não pode pegar livro");
        }

        if (material.isDisponivel()) {
            System.out.println("Data prevista: " + this.dataPrevista);
            material.statusMaterial(false);
        }

        System.out.println("Material indisponível");
        return;
    }

    public void devolverMaterial(Material material, LocalDate localDate) {
        if (material.isDisponivel()) {
            System.out.println("Material não foi emprestado");
            return;
        }

        this.dataDevolucao = LocalDate.now();
    }

    @Override
    public double calcularMulta() {
        if (this.dataDevolucao.isAfter(this.dataPrevista)) {
            long dias = ChronoUnit.DAYS.between(this.dataPrevista, this.dataDevolucao);
            return dias * 2.00;
        }
        return 0;
    }

    public void imprimirEmprestimo() {
        System.out.println("Nome: " + usuario.getNome() +
                ", tipo: " + usuario.getTipoUsuario());

        System.out.println("Material: " + material.getTitulo() +
                ", data emprestimo: " + getDataEmprestimo() +
                ", data prevista: " + getDataPrevista() +
                ", data devolução: " + getDataDevolucao());
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

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }
}
