package projects.ex07.repository;

import projects.ex07.interfaces.Identificavel;

import java.util.ArrayList;
import java.util.List;

public class Repositorio<T extends Identificavel> {

    List<T> tList = new ArrayList<>();

    public void adicionarObjeto(T t) {

        this.tList.add(t);
    }

    public void removerObjeto(T t) {

        this.tList.remove(t);
    }

    public void listarObjetos() {

        for (T t : this.tList) {

            System.out.println(t);
        }

    }

    public void buscarPorId(int id) {

        for (T t : this.tList) {

            if (!t.getId().equals(id)) {

                throw new IllegalArgumentException("Id não encontrado");
            }

            System.out.println(t);
        }
    }
}
