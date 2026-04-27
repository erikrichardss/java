package exercise.pacote02.ex20.servico;

import exercise.pacote02.ex20.classe.ImpostoRenda;
import exercise.pacote02.ex20.repositorio.Imposto;

import java.util.List;

public class CalculadoraImposto {
    public static void calcularTotal(double valorBase, List<Imposto> impostos) {
        if (valorBase > 0 && impostos != null) {
            double calcularImposto = 0;
            double totalImposto = 0;
            for (Imposto imposto : impostos) {
                System.out.println("Valor base: " + valorBase);
                System.out.println("Imposto: " + imposto.getDescricao());
                calcularImposto = imposto.calcular(valorBase);
                totalImposto += calcularImposto;
                System.out.println("Valor imposto: " + calcularImposto);
                System.out.println("---------------");
            }
            System.out.println("Total de imposto: " + totalImposto);
            System.out.println("Valor final: " + (valorBase + totalImposto));
        } else {
            System.out.println("Valores vazios!");
            return;
        }
    }
}
