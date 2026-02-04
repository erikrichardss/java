package maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        int numberPair;

        for (numberPair = 0; numberPair <= 10000000; numberPair ++) {
            if (numberPair % 2 == 0) {
                System.out.println(numberPair);
            }
        }
    }
}
