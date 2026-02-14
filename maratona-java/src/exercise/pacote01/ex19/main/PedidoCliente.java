package exercise.pacote01.ex19.main;

import exercise.pacote01.ex19.classe.ClienteClass;
import exercise.pacote01.ex19.classe.PedidosClass;

public class PedidoCliente {
    public static void main(String[] args) {
        ClienteClass cliente = new ClienteClass("Josvana", 1872386298);
        PedidosClass pedido = new PedidosClass(123, cliente);

        pedido.mostrarPedido();
    }
}
