package maratonajava.javacore.Gassociacao.classe;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Local local;
    private Professor professor;

    public Seminario(String titulo) { this.titulo = titulo; }

    public void adicionarAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public void adicionarProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionarLocal(Local local) {
        if (this.local != null) { return; }
        this.local = local;
    }

    public void imprimirSeminario() {
        System.out.println("----- Seminário -----");
        System.out.println(titulo);

        if (local != null) {
            System.out.println("Local: ");
            local.imprimirLocal();
        }

        if (professor != null) {
            System.out.println("Professor: ");
            professor.imprimirProfessor();
        }

        if (alunos != null) {
            System.out.println("Alunos: ");
            for (Aluno aluno : alunos) {
                aluno.imprimirAluno();
            }
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public Local getLocal() {
        return local;
    }
}
