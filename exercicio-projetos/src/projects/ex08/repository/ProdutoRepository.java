package projects.ex08.repository;

import projects.ex08.domain.Produto;
import projects.ex08.interfaces.Repository;

import java.util.*;

public class ProdutoRepository implements Repository<Produto, Integer> {

    private Map<Integer, Produto> cache = new HashMap<>();

    @Override
    public void salvar(Produto entity) {

        cache.put(entity.getId(), entity);
    }

    @Override
    public Optional<Produto> buscarPorId(Integer id) {

        return Optional.ofNullable(cache.get(id));
    }

    @Override
    public List<Produto> listarTodos() {

        return new ArrayList<>(cache.values());
    }

    @Override
    public Produto deletar(Integer integer) {

        return cache.remove(integer);
    }
}
