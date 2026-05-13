package exercise.pacote02.ex29.service;

import exercise.pacote02.ex29.main.Item;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService<T extends Item> {

    List<T> itens = new ArrayList<>();

    public void adicionarItens(T iten) {

        this.itens.add(iten);
    }

    public void listarItens() {

        for (T iten : this.itens) {

            System.out.println(iten);
        }
    }

    public void removerIten(T iten) {

        this.itens.remove(iten);
    }

    public static <T> void imprimir(List<T> tList) {

        for (T t : tList) {

            System.out.println(t.toString());
        }
    }

    public static void mostrarItens(List<? extends Item> items) {

        for (Item item : items) {

            System.out.println(item);
        }

    }


}
