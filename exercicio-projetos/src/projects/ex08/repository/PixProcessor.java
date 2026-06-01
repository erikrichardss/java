package projects.ex08.repository;

import projects.ex08.domain.Pedido;
import projects.ex08.interfaces.ProcessarPagamento;

public class PixProcessor implements ProcessarPagamento {

    @Override
    public boolean processarPedido(Pedido pedido) {
        return true;
    }
}
