package maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;

    public void imprimir() {
        System.out.println(this.nome);
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
