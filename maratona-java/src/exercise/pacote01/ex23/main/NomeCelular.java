package exercise.pacote01.ex23.main;

import exercise.pacote01.ex23.classe.Celular;
import exercise.pacote01.ex23.classe.Pessoa;

public class NomeCelular {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Erik");

        Celular[] celulares = {
                new Celular(pessoa, new String[]{"S21", "S22", "S23", "S24"})
        };

        for (Celular celularPessoa : celulares) {
            System.out.println("-----------------");
            celularPessoa.mostrarInformacao();
        }
    }
}
