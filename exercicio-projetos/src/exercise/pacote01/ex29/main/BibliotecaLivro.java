package exercise.pacote01.ex29.main;

import exercise.pacote01.ex29.classe.Autor;
import exercise.pacote01.ex29.classe.Biblioteca;
import exercise.pacote01.ex29.classe.Livro;

public class BibliotecaLivro {
    public static void main(String[] args) {
        Autor autorUm = new Autor("Napoleão Hill", "Estados Unidos");
        Autor autorDois = new Autor("Haemin Sunim", "Coreia do Sul");

        Livro livroUm = new Livro("Pense e Enrriqueça", 1937, autorUm);
        Livro livroDois = new Livro("As Leis do Triunfo", 1940, autorUm);
        Livro livroTres = new Livro("As Coisas que Você só vê Quando Desacelera", 2017, autorDois);
        Livro[] livros = {livroUm, livroDois, livroTres};

        Biblioteca biblioteca = new Biblioteca("Meia Noite", livros);

        biblioteca.listarLivrosCadastrados();
    }
}
