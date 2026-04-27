package exercise.pacote01.ex23.classe;

public class Celular {
    private String[] modelo;
    private Pessoa pessoaDona;

    public Celular(String[] modelo) {
        this.modelo = modelo;
    }

    public Celular(Pessoa pessoaDona, String[] modelo) {
        this(modelo);
        this.pessoaDona = pessoaDona;
    }

    public void mostrarInformacao() {
        System.out.println("Pessoa: " + pessoaDona);

        for (String nomeModelo : modelo) {
            System.out.println("Nome modelo: " + nomeModelo);
        }
    }

    public String[] getModelo() { return modelo; }

    public Pessoa getPessoaDona() { return  pessoaDona; }
}
