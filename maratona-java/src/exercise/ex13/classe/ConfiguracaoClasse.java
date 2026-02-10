package exercise.ex13.classe;

public class ConfiguracaoClasse {
    private String idioma;
    private boolean modoEscuro;

    private ConfiguracaoClasse(String idioma, boolean modoEscuro) {
        this.idioma = idioma;
        this.modoEscuro = modoEscuro;
    }

    public static ConfiguracaoClasse criarPadrao() {
        return new ConfiguracaoClasse("pt-br", false);
    }

    public static ConfiguracaoClasse criarPersonalizada(String idioma) {
        return new ConfiguracaoClasse(idioma, true);
    }

    public String getIdioma() {
        return this.idioma;
    }

    public boolean isModoEscuro() {
        return modoEscuro;
    }
}
