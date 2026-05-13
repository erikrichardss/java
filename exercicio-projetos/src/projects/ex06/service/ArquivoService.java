package projects.ex06.service;

import projects.ex06.domain.Evento;
import projects.ex06.domain.Inscricao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ArquivoService {

    public void salvarEventos(Evento evento) {

        try {

            Path path = Path.of("evento.txt");

            if (Files.notExists(path)) {

                Files.createFile(path);
            }

            Files.writeString(path, evento.toString(), StandardOpenOption.APPEND);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void salvarInscricores(Inscricao inscricao) {

        try {

            Path path = Path.of("inscricao.txt");

            if (Files.notExists(path)) {

                Files.createFile(path);
            }

            Files.writeString(path, inscricao.toString(), StandardOpenOption.APPEND);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void lerEvento() {

        Path path = Path.of("evento.txt");

        try {

            if (Files.notExists(path)) {

                throw new IOException("Pasta não encontrada");
            }

            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void lerInscricao() {

        Path path = Path.of("inscricao.txt");

        try {

            if (Files.notExists(path)) {

                throw new IOException("Pasta não encontrada");
            }

            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
