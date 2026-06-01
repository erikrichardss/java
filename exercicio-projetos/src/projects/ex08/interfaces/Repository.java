package projects.ex08.interfaces;

import projects.ex08.domain.Pedido;

import java.util.List;
import java.util.Optional;

public interface Repository <T,ID> {

    void salvar(T entity);

    Optional<T> buscarPorId(ID id);

    List<T> listarTodos();

    Pedido deletar(ID id);
}
