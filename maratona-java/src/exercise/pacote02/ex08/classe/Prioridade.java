package exercise.pacote02.ex08.classe;

public enum Prioridade {
    BAIXA(1, 72),
    MEDIA(2, 48),
    ALTA(3, 24),
    CRITICA(4, 4);

    private int nivelDeUrgencia;
    private int prazoEmHoras;

    Prioridade(int nivelDeUrgencia, int prazoEmHoras) {
        this.nivelDeUrgencia = nivelDeUrgencia;
        this.prazoEmHoras = prazoEmHoras;
    }

    public boolean exigeAtendimentoImediato() {
        if (this.nivelDeUrgencia == 4) {
            return true;
        }
        return false;
    }

    public static Prioridade porNivel(int nivelDeUrgencia) {
        for (Prioridade prioridade : Prioridade.values()) {
            if (nivelDeUrgencia == prioridade.nivelDeUrgencia) {
                return prioridade;
            }
        }
        return null;
    }

    public int getNivelDeUrgencia() { return this.nivelDeUrgencia; }

    public int getPrazoEmHoras() { return this.prazoEmHoras; }
}
