package exercise.pacote02.ex07.classe;

public enum NivelDeAcesso {
    VISITANTE(1, "Acesso básico"),
    FUNCIONARIO(2, "Acesso Operacional"),
    GERENTE(3, "Acesso gerencial"),
    ADMIN(4, "Acesso geral");

    private int nivel;
    private String descricao;

    NivelDeAcesso(int nivel, String descricao) {
        this.nivel = nivel;
        this.descricao = descricao;
    }

    public boolean podeGerenciarUsuario() {
        if (this.nivel == 3 || this.nivel == 4) {
            return true;
        }
        return false;
    }

    public int getNivel() {
        return nivel;
    }

    public String getDescricao() {
        return descricao;
    }
}
