package exercise.pacote01.ex30.classe;

import java.util.Scanner;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;
    private static int totalLivros;
    private static int totalmprestados;

    static {
        System.out.println("Sistema da biblioteca iniciado...");
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
        totalLivros += 1;
    }

    public void imprimir() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Foi emprestado? " + this.emprestado);
        System.out.println("Total: " + Livro.totalLivros);
        System.out.println("Total emprestados: " + Livro.totalmprestados);
    }

    public void emprestar() {
        if (this.emprestado) {
            System.out.println("Livro emprestado.");
        }
        this.emprestado = true;
        Livro.totalmprestados++;
        System.out.println("Emprestado com sucesso.");
    }

    public void devolver() {
        if (!this.emprestado) {
            System.out.println("Livro não está emprestado.");
        }
        this.emprestado = false;
        Livro.totalmprestados--;
        System.out.println("Devolvido com sucesso.");
    }
}
