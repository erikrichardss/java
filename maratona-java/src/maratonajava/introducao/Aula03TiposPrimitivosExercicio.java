package maratonajava.introducao;

/*
Prática
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no enredeço <endereço> que recebi de <salario>; na data <data>
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Erik";
        String endereco = "Conceição do Mato Dentro";
        double salario = 3598.00;
        String dataRecebimentoSalario = "17/01/2026";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + " que recebi de " + salario + "; na data " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
