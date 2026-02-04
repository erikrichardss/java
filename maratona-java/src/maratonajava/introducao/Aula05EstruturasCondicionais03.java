package maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6800;
        String mensagenDoar = "Eu vou doar 500";
        String mensagemNaoDoar = "Ainda não tenho condições";
        // (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagenDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}