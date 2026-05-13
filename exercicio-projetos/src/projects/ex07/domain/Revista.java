package projects.ex07.domain;

public class Revista extends Material {

    private String edicao;


    public Revista(String titulo, String edicao) {

        super(titulo);
        this.edicao = edicao;
    }

    public String getEdicao() {
        return edicao;
    }
}
