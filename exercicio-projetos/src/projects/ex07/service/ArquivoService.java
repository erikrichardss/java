package projects.ex07.service;

import projects.ex07.domain.Emprestimo;
import projects.ex07.domain.Material;
import projects.ex07.domain.Usuario;

import java.io.IOException;
import java.nio.file.*;

public class ArquivoService {

    public <T> void salvarArquivo(String nomeArquivo, T t) {

        try {

            Path path = Paths.get(nomeArquivo);

            if (Files.notExists(path)) {

                Files.createFile(path);
            }

            Files.writeString(path, t.toString() + System.lineSeparator(), StandardOpenOption.APPEND);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public <T> void lerArquivo(String nomeArquivo) {

        try {

            Path path = Paths.get(nomeArquivo);

            if (Files.notExists(path)) {

                throw new IOException("Arquivo \"" + nomeArquivo + "\" não encontrado!");
            }

            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void salvarUsuarios(Usuario usuario) {

        try {

            Path path = Paths.get("usuario.txt");

            if (Files.notExists(path)) {

                Files.createFile(path);
            }

            Files.writeString(path, usuario.toString(), StandardOpenOption.APPEND);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void salvarMateriais(Material material) {

        try {

            Path path = Paths.get("material.txt");

            if (Files.notExists(path)) {

                Files.createFile(path);
            }

            Files.writeString(path, material.toString(), StandardOpenOption.APPEND);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }

    public void salvarImprestimos(Emprestimo emprestimo) {

        try {

            Path path = Paths.get("emprestimo.txt");

            if (Files.notExists(path)) {

                Files.createFile(path);
            }

            Files.writeString(path, emprestimo.toString(), StandardOpenOption.APPEND);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void lerUsuarios() {

        try {

            Path path = Paths.get("usuario.txt");

            if (Files.notExists(path)) {

                throw new IOException("Pasta \"Usuario não encontrada\"");
            }

            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void lerMateriais() {

        try {

            Path path = Paths.get("material.txt");

            if (Files.notExists(path)) {

                throw new IOException("Pasta material não encontrada");
            }

            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void lerImprestimos() {

        try {

            Path path = Paths.get("emprestimo.txt");

            if (Files.notExists(path)) {

                throw new IOException("Pasta emprestimo não encontrada");
            }

            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
