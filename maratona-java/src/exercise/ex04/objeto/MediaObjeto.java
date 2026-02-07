package exercise.ex04.objeto;

public class MediaObjeto {
    public double calcularMedia() {
        double primeiroNumero = 214;
        double segundoNumero = 342;
        double mediaDosNumeros = 0;

        mediaDosNumeros =  (primeiroNumero + segundoNumero) / 2;

        return mediaDosNumeros;
    }

    public int maiorNumero() {
        int primeiroNumero = 5;
        int segundoNumero = 5;
        String frase = "Numeros iguais.";

        if (primeiroNumero > segundoNumero) {

            return primeiroNumero;
        } else if (segundoNumero > segundoNumero) {

            return segundoNumero;
        } else {

            System.out.println(frase);
        }

        return 0;
    }
}
