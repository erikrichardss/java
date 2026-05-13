package exercise.pacote02.ex29.main;

public class Dvd extends Item {

    private int duracao;

    public Dvd(String titulo, int duracao) {

        super(titulo);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + "Dvd{" +
                "duracao=" + duracao +
                '}';
    }

    public int getDuracao() {
        return duracao;
    }
}
