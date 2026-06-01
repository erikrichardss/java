package projects.ex08.interfaces;

import projects.ex08.domain.Pedido;

public interface ProcessarPagamento {

    boolean processarPedido(Pedido pedido);
}
