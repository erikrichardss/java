package exercise.pacote02.ex24.classe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoEspecifico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nome = {"Ana", "Carlos", "Maria", "João", "Pedro"};

        int posicao = scanner.nextInt();

        try {
            System.out.println(nome[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
