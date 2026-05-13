package exercise.pacote02.ex29.main;

public abstract class Item {

    private String titulo;

    public Item(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Item{" +
                "titulo='" + titulo + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }
}
