package projects.ex02.main;

import projects.ex02.domain.Assinatura;
import projects.ex02.domain.Usuario;
import projects.ex02.enums.TipoPlano;
import projects.ex02.exception.AssinaturaExpiradaException;

public class SistemaDeAssinatura {

    public static void main(String[] args) {

        try {

            Usuario usuario = new Usuario("Erik", "erikrichardD@gmail.com.br");
            Assinatura assinatura = new Assinatura(usuario, TipoPlano.PREMIUM);

            assinatura.renovarAssinatura();
            assinatura.acessoAoSistema();

            assinatura.imprimirUsuario();
        } catch (IllegalArgumentException | AssinaturaExpiradaException e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}
