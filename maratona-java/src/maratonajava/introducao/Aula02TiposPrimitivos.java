package maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0f;
        byte idadeByte = 127;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Erik";

        System.out.println("The age is " + age + " years.");
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println("Oi meu nome é " + nome);
    }
}
