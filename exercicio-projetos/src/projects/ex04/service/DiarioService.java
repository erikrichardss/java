package projects.ex04.service;

import projects.ex04.domain.SecaoEstudos;
import projects.ex04.enums.TipoEstudo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class DiarioService {

    public void criarSecao(SecaoEstudos secaoEstudos) {

        try {

            Path path = Path.of("arquivo_estudo.txt");

            if (Files.notExists(path)) {

                Files.createFile(path);
            }

            String linha = secaoEstudos.getDescricao() + ";" +
                    secaoEstudos.getTipoEstudo().name() + ";" +
                    secaoEstudos.getDuracaoEstudo() + "\n";

            Files.writeString(path, linha, StandardOpenOption.APPEND);
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }

    public void lerArquivo() {

        List<SecaoEstudos> secaoEstudosList = new ArrayList<>();
        Path caminho = Path.of("arquivo_estudo.txt");

        try {

            if (Files.notExists(caminho)) {

                throw new FileNotFoundException("Arquivo não encontrado");
            }

            List<String> strings = Files.readAllLines(caminho);

            for (String string : strings) {

                if (string.trim().isEmpty()) continue;

                try {

                    String[] partes = string.split(";");

                    if (partes.length != 3) {

                        throw new IllegalArgumentException("Formato inválido na linha " + string);
                    }

                    String descricao = partes[0];
                    TipoEstudo tipo = TipoEstudo.valueOf(partes[1]);
                    int duracao = Integer.parseInt(partes[2]);

                    SecaoEstudos secaoEstudos = new SecaoEstudos(descricao, tipo, duracao);
                    secaoEstudosList.add(secaoEstudos);
                } catch (Exception e) {

                    e.printStackTrace();
                }

                System.out.println(string);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
