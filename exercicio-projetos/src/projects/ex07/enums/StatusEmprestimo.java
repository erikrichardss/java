package projects.ex07.enums;

public enum StatusEmprestimo {

    ATIVO("Ativo"),
    FINALIZADO("Finalizado"),
    ATRASADO("Atrasado");

    private String nomeStatus;

    StatusEmprestimo(String nomeStatus) {

        this.nomeStatus = nomeStatus;
    }

    public String getNomeStatus() {
        return nomeStatus;
    }
}
