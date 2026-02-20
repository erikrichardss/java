package maratonajava.javacore.Isobrescrita.dominio;

public class Anime {
    private String nome;

    public Anime(String nome) { this.nome = nome; }

    @Override
    public String toString() {
        return "Anime: " + this.nome;
    }

    public String getNome() { return  this.nome; }
}
