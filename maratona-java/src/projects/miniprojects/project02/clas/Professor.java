package projects.miniprojects.project02.clas;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminario) {
        this(nome, especialidade);
        this.seminarios = seminario;
    }

    public void imprimirProfessor() {
        System.out.println("Professor: " + getNome() +
                "\nEspecialidade: " + getEspecialidade());

        System.out.println("-- Seminario --");
        if (this.seminarios == null) { return; }
        for (Seminario seminarioProfessor : this.seminarios) {
            if (seminarioProfessor.getTitulo() != null ){
                System.out.println("Título: " + seminarioProfessor.getTitulo());
            }

            if (seminarioProfessor.getLocal() != null) {
                System.out.println("Local: " + seminarioProfessor.getLocal().getEndereco());
            }

            if (seminarioProfessor.getAlunos() != null) {
                System.out.println("-- Alunos --");

                for (Aluno seminarioAluno : seminarioProfessor.getAlunos()) {

                    if (seminarioAluno == null) { continue; }
                    System.out.println("Nome: " + seminarioAluno.getNome());
                }
            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public Seminario[] getSeminarios() {
        return this.seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
