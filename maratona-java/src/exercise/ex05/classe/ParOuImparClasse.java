package exercise.ex05.classe;

import exercise.ex05.objeto.ParOuImparObjeto;

public class ParOuImparClasse {
    public static void main() {
        ParOuImparObjeto parOuImpar = new ParOuImparObjeto();

        System.out.println(parOuImpar.verificarParOuImpar(1, 4, 5, 23, 53, 13, 34, 12, 22));
    }
}
