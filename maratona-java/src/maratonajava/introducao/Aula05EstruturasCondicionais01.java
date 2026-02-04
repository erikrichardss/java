package maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        // !

        if(isAutorizadoComprarBebida) {
           System.out.println("Altorizado a comprar bebida alcólica.");
        } else {
            System.out.println("Não autorizado a comprar bebida alcólica.");
        }

        if(isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado a comprar bebida alcólica.");
        }

        boolean c = false;

        if(c == true) {
            System.out.println("Dentro do if.");
        }

        System.out.println("Fora do if");
    }
}
