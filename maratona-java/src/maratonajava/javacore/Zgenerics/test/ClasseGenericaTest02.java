package maratonajava.javacore.Zgenerics.test;

import maratonajava.javacore.Zgenerics.dominio.Barco;
import maratonajava.javacore.Zgenerics.service.BarcoRentavelService;

public class ClasseGenericaTest02 {

    public static void main(String[] args) {

        BarcoRentavelService BarcoRentavelService = new BarcoRentavelService();
        Barco Barco = BarcoRentavelService.buscarBarcoDisponivel();

        System.out.println("Usando o Barco por um mês....");
        BarcoRentavelService.retornarBarcoAlugado(Barco);
    }
}
