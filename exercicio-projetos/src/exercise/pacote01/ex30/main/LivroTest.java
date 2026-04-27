package exercise.pacote01.ex30.main;

import exercise.pacote01.ex30.classe.Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livroUm = new Livro("O poder do Agora", "Eckart Tolle");
        Livro livroDois = new Livro("Um novo mundo", "Eckart Tolle");
        Livro livroTres = new Livro("Quincas Borba", "Machado de Assis");

        livroUm.emprestar();
        livroDois.emprestar();

        System.out.println("----------");
        livroUm.imprimir();

        System.out.println("----------");
        livroDois.imprimir();

        System.out.println("----------");
        livroTres.imprimir();
    }
}
