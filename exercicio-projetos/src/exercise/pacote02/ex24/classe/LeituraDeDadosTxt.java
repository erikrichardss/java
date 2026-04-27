package exercise.pacote02.ex24.classe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeituraDeDadosTxt {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("dados.txt"))) {

            String linha;

            while ((linha = bufferedReader.readLine()) == null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo");
        }
    }
}
