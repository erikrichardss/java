package exercise.pacote01.ex24.classe;

public class Times {
    private String nome;
    private Jogador[] jogadores;
    private int quantidadeJogadores;

    public Times(String nome, int capacidade) {
        this.nome = nome;
        this.jogadores = new Jogador[capacidade];
        this.quantidadeJogadores = 0;
    }

    public void adicionarJogadores(Jogador jogadores) {
        if (quantidadeJogadores < this.jogadores.length) {
            this.jogadores[quantidadeJogadores] = jogadores;
            quantidadeJogadores++;
            System.out.println("Jogador Adicionado!");
        } else {
            System.out.println("O time já está cheio!");
        }
    }

    public void listarJogadores() {
        System.out.println("Time: " + nome);

        for (int i = 0; i < quantidadeJogadores; i++) {
            jogadores[i].exibirDados();
        }
    }


}
