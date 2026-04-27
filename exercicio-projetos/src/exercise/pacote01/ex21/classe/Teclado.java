package exercise.pacote01.ex21.classe;

public class Teclado {
    private String marca;
    private boolean mecanico;

    public Teclado(String marca, boolean mecanico) {
        this.marca = marca;
        this.mecanico = mecanico;
    }

    public void setmarca(String marca) { this.marca = marca; }

    public void setmecanico(boolean mecanico) { this.mecanico = mecanico; }

    public String getmarca() { return this.marca; }

    public boolean getmecanico() { return this.mecanico; }
}
