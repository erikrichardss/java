package exercise.projetos.proj2.repositorio;

public enum TipoUsuario {
    ALUNO(7),
    PROFESSOR(14);

    private int prazoDeEntrega;
    TipoUsuario(int prazoDeEntrega) {
        this.prazoDeEntrega = prazoDeEntrega;
    }
}
