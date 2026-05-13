package projects.ex07.enums;

public enum TipoUsuario {

    ALUNO("Aluno", 3),
    PROFESSOR("Professor", 5),
    VISITANTE("Visitante", 1);

    private String nomeTipoUsuario;
    private int limiteEmprestimo;

    TipoUsuario(String nomeTipoUsuario, int limiteEmprestimo) {

        this.nomeTipoUsuario = nomeTipoUsuario;
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public String getNomeTipoUsuario() {

        return nomeTipoUsuario;
    }

    public int getLimiteEmprestimo() {

        return limiteEmprestimo;
    }
}
