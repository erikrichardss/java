package exercise.pacote01.ex19.classe;

public class ClienteClass {
    private String nome;
    private int cpf;

    public ClienteClass(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setcpf(int cpf) {
        this.cpf = cpf;
    }

    public int getcpf() {
        return this.cpf;
    }
}
