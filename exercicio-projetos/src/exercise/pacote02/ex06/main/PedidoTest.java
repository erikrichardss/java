package exercise.pacote02.ex06.main;

import exercise.pacote02.ex06.classe.Pedido;
import exercise.pacote02.ex06.classe.StatusPedido;

public class PedidoTest {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Erik", 100);

        pedido.alterarStatus(StatusPedido.ENVIADO);

        pedido.exibirPedido();
    }
}
