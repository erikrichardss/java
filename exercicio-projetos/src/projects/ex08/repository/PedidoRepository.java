package projects.ex08.repository;

import projects.ex08.domain.Pedido;
import projects.ex08.interfaces.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PedidoRepository implements Repository<Pedido, Integer> {

    private List<Pedido> pedidos = new ArrayList<>();

    @Override
    public void salvar(Pedido entity) {

        pedidos.add(entity);
    }

    @Override
    public Optional<Pedido> buscarPorId(Integer integer) {

        return Optional.ofNullable(pedidos.get(integer));
    }

    @Override
    public List<Pedido> listarTodos() {

        return pedidos;
    }

    @Override
    public Pedido deletar(Integer integer) {

        for (Pedido pedido : pedidos) {

            if (pedido.getId().equals(integer)) {

                return pedido;
            }
        }

        return null;
    }
}