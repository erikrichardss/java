package exercise.pacote02.ex21.main;

import exercise.pacote02.ex21.classe.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(835);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor que deseja sacar");
        double valor = scanner.nextDouble();

        try {

            contaBancaria.sacar(valor);
        } catch (RuntimeException e) {

            e.printStackTrace();
        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
