package exercise.projetos.proj2.test;

import exercise.projetos.proj2.dominio.Emprestimo;
import exercise.projetos.proj2.dominio.Livro;
import exercise.projetos.proj2.dominio.Usuario;
import exercise.projetos.proj2.repositorio.TipoUsuario;

import java.time.LocalDate;

public class BibliotecaTest {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Erik", "12487-12", TipoUsuario.ALUNO);

        Livro livro = new Livro(1296, "POO Java");

        Emprestimo emprestimo = new Emprestimo(usuario, livro);

        emprestimo.criarEmprestimo(livro);
        emprestimo.devolverMaterial(livro, LocalDate.now().plusDays(10));
        System.out.println("Multa: " + emprestimo.calcularMulta());
        emprestimo.imprimirEmprestimo();
    }
}
