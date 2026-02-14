package exercise.pacote01.ex19.classe;

public class PedidosClass {
    private int numero;
    private ClienteClass cliente;

    public PedidosClass(int numero, ClienteClass cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public void mostrarPedido() {
        System.out.println(this.numero);
        System.out.println(cliente.getNome());
    }
}
