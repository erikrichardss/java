package exercise.pacote02.ex14.classe;

public class Cliente {
    private String nome;
    private String cpf;
    private Pedido pedido;

    public void criarPedido(Pedido pedidos) {
        if (this.pedido == null) return;

        if (!this.pedido.isFinalizado()) {
            System.out.println("Você já tem um pedido ativo");
            return;
        }

        this.pedido = pedidos;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome() +
                ", cpf: " + getCpf() +
                ", pedido: " + getPedido());
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Pedido getPedido() {
        return pedido;
    }
}
