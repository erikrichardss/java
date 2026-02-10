package maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private String genero;
    private String studio;
    private int episodios;

    public Anime(String nome, String tipo, int episodios, String genero) {
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodios, String genero, String studio) {
        this(nome, tipo, episodios, genero);
        this.studio = studio;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos.");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.studio);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setEpisodios(int episodeos) {
        this.episodios = episodeos;
    }

    public int getEpisodios() {
        return this.episodios;
    }
}
