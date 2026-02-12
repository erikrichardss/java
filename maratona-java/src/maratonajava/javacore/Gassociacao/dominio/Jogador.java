package maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprimir() {
        System.out.println(this.nome);

        if (this.time != null) {
            System.out.println(time.getNome());
        }
    }

    public Jogador(String nome) { this.nome = nome; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public void setTime(Time time) { this.time = time; }

    public Time getTime() { return this.time; }
}
