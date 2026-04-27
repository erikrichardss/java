package exercise.pacote02.ex07.classe;

public class Usuario {
    private String nome;
    private NivelDeAcesso nivelDeAcesso;

    public Usuario(String nome, NivelDeAcesso nivelDeAcesso) {
        this.nome = nome;
        this.nivelDeAcesso = nivelDeAcesso;
    }

    @Override
    public String toString() {
        return "Usuario: " + this.nome +
                ", nível: " + nivelDeAcesso.getNivel() +
                ", descrição: " + nivelDeAcesso.getDescricao();
    }

    public void gerenciarUsuario() {
        System.out.println(nivelDeAcesso.podeGerenciarUsuario());
    }
}
