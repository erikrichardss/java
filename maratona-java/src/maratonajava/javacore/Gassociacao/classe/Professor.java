package maratonajava.javacore.Gassociacao.classe;

public class Professor {
    private String nome;
    private String especialidades;
    private Seminario[] seminario;

    public Professor(String nome, String especialidades) {
        this.nome = nome;
        this.especialidades = especialidades;
    }

    public void seminarios(Seminario[] seminario) {
        this.seminario = seminario;
    }

    public void imprimirProfessor() {
        System.out.println("Nome: " + nome);
        System.out.println("Especialidade: " + especialidades);

        if (seminario != null) {
            System.out.println("Seminários: ");
            for (Seminario seminarios : getSeminario()) {
                System.out.println(seminarios.getTitulo());
            }
        }
    }

    public String getNome() {
        return nome; }

    public String getEspecialidades() {
        return especialidades;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }
}
