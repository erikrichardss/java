package maratonajava.javacore.Vio.test;

import java.io.*;

public class BufferWriterTest01 {

    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true)) {

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("O devDojo é o melhor curso do brasilllllllll");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
