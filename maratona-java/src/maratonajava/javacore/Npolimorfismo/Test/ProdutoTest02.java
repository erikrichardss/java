package maratonajava.javacore.Npolimorfismo.Test;

import maratonajava.javacore.Npolimorfismo.dominio.Computador;
import maratonajava.javacore.Npolimorfismo.dominio.Produto;
import maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Rizen 9", 3000);
        Produto produto1 = new Tomate("Americano", 20);

        produto.getNome();
        produto.getValor();
        produto.calcularImposto();

        System.out.println("-----------------------");

        produto1.getNome();
        produto1.getValor();
        produto1.calcularImposto();
    }
}
