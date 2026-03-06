package maratonajava.javacore.Npolimorfismo.Test;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Rizen 9", 3000);
        Tomate tomate = new Tomate("Americano", 20);

        tomate.setDataValidade("17/08/2026");

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
