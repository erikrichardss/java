package exercise.ex15.classe;

public class AlunoClasse {
    private String nome;
    private static int totalAlunos;

    public AlunoClasse(String nome) {
        this.nome = nome;
        AlunoClasse.totalAlunos = AlunoClasse.totalAlunos + 1;
    }

    public void imprimir() {
        System.out.println(getNome());
        System.out.println(AlunoClasse.totalAlunos);
    }

    public String getNome() {
        return nome;
    }
}
