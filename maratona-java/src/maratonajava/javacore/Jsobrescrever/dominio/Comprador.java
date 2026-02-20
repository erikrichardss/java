package maratonajava.javacore.Jsobrescrever.dominio;

public class Comprador {
    private String nome;

    @Override
    public String toString() {
        return "Nome: " + this.nome;
    }

    public void setNome(String nome) { this.nome = nome; }

    public String getNome() { return this.nome; }
}
