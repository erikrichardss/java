package exercise.pacote01.ex27.main;

import exercise.pacote01.ex27.classe.Biblioteca;
import exercise.pacote01.ex27.classe.Livro;

import java.util.Scanner;

public class BibliotecaLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("As Leis do Triunfo", "Napoleão Hill");
        Livro livro2 = new Livro("Desperte seu Gigante Interior", "Tonny Hobins");
        Livro livro3 = new Livro("Quincas Borba", "Machado de Assis");
        Livro[] livros = new Livro[]{livro1, livro2, livro3};
        Biblioteca biblioteca = new Biblioteca("Biblioteca Mágica", livros);

        Scanner scanner = new Scanner(System.in);

        biblioteca.adicionarLivro(livros);
        biblioteca.listarLivros();
    }
}
