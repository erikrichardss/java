package exercise.pacote02.ex16.main;

import exercise.pacote02.ex16.classe.Assinatura;
import exercise.pacote02.ex16.classe.Plano;

public class PlanoTest {
    public static void main(String[] args) {
        Plano plano = new Plano("Casal", 19.90, 2);
        Plano plano2 = new Plano("Familia", 29.90, 4);

        Assinatura assinatura = new Assinatura(plano);

        assinatura.registrarAtraso();
        assinatura.registrarAtraso();
        assinatura.pagarMensalidade();
        assinatura.novoPlano(plano2);
        assinatura.registrarAtraso();
        assinatura.registrarAtraso();
        System.out.println(assinatura.podeAssistir());
        assinatura.imprimirAssinatura();
    }
}
