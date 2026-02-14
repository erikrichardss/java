package maratonajava.javacore.Gassociacao.classe;

public class Local {
    private String endereco;

    public void imprimirLocal() {
        System.out.println("Local: ");
        System.out.println(getEndereco());
    }

    public Local(String endereco) { this.endereco = endereco; }

    public String getEndereco() { return endereco; }
}
