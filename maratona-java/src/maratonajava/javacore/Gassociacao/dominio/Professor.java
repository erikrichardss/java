package maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarioa;

    public Seminario[] getSeminarioa() {
        return seminarioa;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarioa) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarioa = seminarioa;
    }

    public void setSeminarioa(Seminario[] seminarioa) {
        this.seminarioa = seminarioa;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("-------");
        System.out.println("Professor: " + this.nome);

        if (this.seminarioa == null) return;
        System.out.println("## Seminários cadastrados ##");

        for (Seminario seminario : this.seminarioa) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal());

            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;

            System.out.println("** Alunos **");

            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
            }

        }

    }

    public void setNome(String nome) { this.nome = nome; }

    public String getNome() { return nome; }

}
