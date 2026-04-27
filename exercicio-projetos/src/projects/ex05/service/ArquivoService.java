package projects.ex05.service;

import projects.ex05.domain.Pedido;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ArquivoService {

    public void salvarPedido(Pedido pedido) {

        try {

            Path path = Path.of("pedido.txt");

            if (Files.notExists(path)) {

                Files.createFile(path);
            }

            String linhaPedido =
                            "Data: " + pedido.getDataPedido() +
                            " - Cliente: " + pedido.getCliente().getNome() +
                            " - Total: " + pedido.calcularTotal() +
                            " - Status: " + pedido.getStatusPedido().getNomeStatus();

            Files.writeString(path, linhaPedido, StandardOpenOption.APPEND);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public void lerPedido() {

        Path path = Paths.get("pedido.txt");

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
