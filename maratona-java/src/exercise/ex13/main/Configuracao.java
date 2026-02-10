package exercise.ex13.main;

import exercise.ex13.classe.ConfiguracaoClasse;

public class Configuracao {
    public static void main() {
        ConfiguracaoClasse configuracaoPersonalizada = ConfiguracaoClasse.criarPersonalizada("en");
        ConfiguracaoClasse configuracaoPadrao = ConfiguracaoClasse.criarPadrao();

        System.out.println(configuracaoPersonalizada.getIdioma());
        System.out.println(configuracaoPersonalizada.isModoEscuro());

        System.out.println(configuracaoPadrao.getIdioma());
        System.out.println(configuracaoPadrao.isModoEscuro());
    }
}
