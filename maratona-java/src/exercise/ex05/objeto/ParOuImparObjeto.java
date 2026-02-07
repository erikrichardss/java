package exercise.ex05.objeto;

public class ParOuImparObjeto {
    public int verificarParOuImpar(int... number) {
        int maiorNuemro = 0;

        for (int mostrarNumero : number) {

            if (mostrarNumero %2 == 0) {

                System.out.println(mostrarNumero + " é par");
            } else {

                System.out.println(mostrarNumero + " é impar.");
            }

            if (mostrarNumero > maiorNuemro) {
                maiorNuemro = mostrarNumero;
            }
        }

        System.out.print("O maior numero é: ");
        return maiorNuemro;
    }
}
