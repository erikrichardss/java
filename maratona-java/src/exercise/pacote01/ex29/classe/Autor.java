package exercise.pacote01.ex29.classe;

public class Autor {
    private String nome;
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() { return nome; }

    public String getNacionalidade() { return nacionalidade; }

    public  void imprimirDadosAutor() {
        System.out.println("** Autor **");
        System.out.println("Nome: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println();
    }
}
