package maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimirDados() {
        System.out.println("--------------");
        System.out.println(this.nome);
        System.out.println(this.idade);

        int numerator = 0;
        for (int i = 0; i < salario.length; i++) {

            System.out.println("Salário " + (numerator = i+1) + ": " + this.salario[i]);
        }
    }

    public void mediaDosSalarios() {

        double mediaDosSalariosObtidos = 0;
        int temp = 0;

        for (int i = 0; i < this.salario.length; i++) {

            mediaDosSalariosObtidos += this.salario[i];
            temp = i+=1;
        }

        mediaDosSalariosObtidos /= temp;

        System.out.println(mediaDosSalariosObtidos);
    }
}
