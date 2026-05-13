package exercise.pacote02.ex29.main;

public class Revista extends Item {

    private int edicao;

    public Revista(String titulo, int edicao) {
        super(titulo);
        this.edicao = edicao;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" +
                "edicao=" + edicao +
                '}';
    }

    public int getEdicao() {
        return edicao;
    }
}
