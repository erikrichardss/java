package projects.ex07.main;

import projects.ex07.domain.Emprestimo;
import projects.ex07.domain.Livro;
import projects.ex07.domain.Revista;
import projects.ex07.domain.Usuario;
import projects.ex07.enums.TipoUsuario;
import projects.ex07.service.ArquivoService;
import projects.ex07.service.BibliotecaService;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Erik", "erik@gmail.coim", TipoUsuario.ALUNO);
        Livro livro = new Livro("As Crônicas de Narnia", "C. S. Lewis", 689);
        Revista revista = new Revista("PlayBoy", "12v");
        BibliotecaService bibliotecaService = new BibliotecaService();

//        System.out.println();
//        System.out.println("Cadastro de materiais");
        bibliotecaService.cadastrarMaterial(livro);
        bibliotecaService.cadastrarMaterial(revista);

//        System.out.println();
//        System.out.println("Cadastro de usuarios");
        bibliotecaService.cadastrarUsuarios(usuario);

//        System.out.println("Emprestimo");
        Emprestimo emprestimo = new Emprestimo(usuario, livro);

        ArquivoService arquivoService = new ArquivoService();

//        System.out.println("Arquivo");
        arquivoService.salvarArquivo("usuario.txt", usuario);
        arquivoService.salvarArquivo("material.txt", livro);
        arquivoService.salvarArquivo("material.txt", revista);
        arquivoService.salvarArquivo("emprestimo.txt", emprestimo);

        arquivoService.lerArquivo("usuario.txt");
        arquivoService.lerArquivo("material.txt");
        arquivoService.lerArquivo("emprestimo.txt");
    }
}
