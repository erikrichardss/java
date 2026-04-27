package exercise.pacote02.ex12.main;

import exercise.pacote02.ex12.classe.Biblioteca;
import exercise.pacote02.ex12.classe.Livro;
import exercise.pacote02.ex12.classe.Usuario;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Quincas Borba", "Machado de Assis");
        Livro livro2 = new Livro("O Alquimista", "Machado de Assis");
        Livro livro3 = new Livro("Dom Casmurro", "Machado de Assis");

        Livro[] livros = new Livro[]{livro1, livro2, livro3};
        Usuario usuario1 = new Usuario("Erik", "138428139-13");
        Usuario usuario2 = new Usuario("Nicole", "138428139-13");
        Biblioteca biblioteca = new Biblioteca("Meia noite");

        livro1.exibirInformacaoLivro();

        System.out.println("---------------");

        usuario1.pegarLivro(livro2);
        usuario1.devolverLivro(livro2);
        usuario1.exibirInformacaoUsuario();

        usuario2.pegarLivro(livro2);
        usuario2.exibirInformacaoUsuario();

        System.out.println("----------------");

        biblioteca.adicionarLivro(livros);
        biblioteca.buscarLivroPorTitulo("quincas borba");
        biblioteca.listarLivros();
    }
}
