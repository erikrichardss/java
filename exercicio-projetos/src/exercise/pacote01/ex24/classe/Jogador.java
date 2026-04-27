package exercise.pacote01.ex24.classe;

public class Jogador {
    private String nome;
    private int numero;

    public Jogador(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + " Numero: " + numero);
    }

    public String getNome() { return nome; }

    public int getNumero() { return numero; }
}
