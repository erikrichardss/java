package exercise.pacote02.ex17.main;

import exercise.pacote02.ex17.classe.Carro;
import exercise.pacote02.ex17.classe.Moto;
import exercise.pacote02.ex17.classe.Veiculo;

public class VeiculoTest {
    public static void main(String[] args) {
        Veiculo carro = new Carro("Chevrole S10", 2010, 4);
        Veiculo moto = new Moto("Harley Davidson", 2010, 300);
        Veiculo[] veiculos = {carro, moto};

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDados();
        }
    }
}
