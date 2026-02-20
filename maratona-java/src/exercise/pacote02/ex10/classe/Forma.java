package exercise.pacote02.ex10.classe;

public abstract class Forma {
    private String nome;
    private String cor;
    private static int totalFormas;

    public Forma(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
        Forma.totalFormas++;
    }

    public abstract void calcularArea();

    public void exibirInformacao() {
        System.out.println("Nome: " + getNome() +
                ", cor: " + getCor());
        calcularArea();
        System.out.println("-------------------------");
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public static int getTotalFormas() {
        return totalFormas;
    }
}
