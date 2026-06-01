package projects.ex08.domain;

public class Cliente extends  Usuario {

    private Carrinho carrinho;

    public Cliente(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String getTipoUsuario() {
        return "";
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + this.getId() +
                ", nome=" + this.getNome() +
                ", tipo usuario=" + this.getTipoUsuario() +
                ", carrinho=" + carrinho.toString() +
                '}';
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}
