package exercise.ex02.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LerArquivo {

    public static void main(String[] args) {

        File file = new File("entrada.txt");

        try (FileWriter fw = new FileWriter(file)) {

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("João,1000\n" +
                    "Maria,2500\n" +
                    "Carlos,1800\n" +
                    "Ana,3000");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {

            throw new RuntimeException(e);
        }

        Path path = Paths.get("entrada.txt");
        try {

            System.out.println(Files.readAllLines(path));
        } catch (IOException e) {

            throw new RuntimeException(e);
        }
    }
}
