package exercise.pacote01.ex24.main;

import exercise.pacote01.ex24.classe.Jogador;
import exercise.pacote01.ex24.classe.Times;

public class JogadorTime {
    public static void main(String[] args) {
        Times time = new Times("Barcelona", 3);

        Jogador jogador1 = new Jogador("Messi", 10);
        Jogador jogador2 = new Jogador("Suarez", 9);
        Jogador jogador3 = new Jogador("Ronaldo", 11);

        time.adicionarJogadores(jogador1);
        time.adicionarJogadores(jogador2);
        time.adicionarJogadores(jogador3);

        time.listarJogadores();
    }
}
