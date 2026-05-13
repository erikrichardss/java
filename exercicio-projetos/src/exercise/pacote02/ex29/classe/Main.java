package exercise.pacote02.ex29.classe;

import exercise.pacote02.ex29.main.Dvd;
import exercise.pacote02.ex29.main.Livro;
import exercise.pacote02.ex29.main.Revista;
import exercise.pacote02.ex29.service.BibliotecaService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Livro> livroList = List.of(new Livro("As Crônicas de Narnia", "C. S. Lewis"));
        List<Dvd> dvdList = List.of(new Dvd("Princesinha Sofia", 1200));
        List<Revista> revistaList = List.of(new Revista("Playboy", 3));

        BibliotecaService<Livro> livroBibliotecaService = new BibliotecaService<>();
        BibliotecaService<Dvd> dvdBibliotecaService = new BibliotecaService<>();
        BibliotecaService<Revista> revistaBibliotecaService = new BibliotecaService<>();

        for (Livro livro : livroList) {

            livroBibliotecaService.adicionarItens(livro);
        }

        for (Dvd dvd : dvdList) {

            dvdBibliotecaService.adicionarItens(dvd);
        }

        for (Revista revista : revistaList) {

            revistaBibliotecaService.adicionarItens(revista);
        }

        livroBibliotecaService.listarItens();
        dvdBibliotecaService.listarItens();
        revistaBibliotecaService.listarItens();


        BibliotecaService.imprimir(livroList);
        BibliotecaService.mostrarItens(livroList);

        for (Livro livro : livroList) {

            livroBibliotecaService.removerIten(livro);
        }

        livroBibliotecaService.listarItens();
    }
}
