package exercise.projetos.proj5.main;

import exercise.projetos.proj5.domain.Assinatura;
import exercise.projetos.proj5.domain.Usuario;
import exercise.projetos.proj5.enums.TipoPlano;
import exercise.projetos.proj5.exceptions.AssinaturaExpiradaException;

import java.time.LocalDate;

public class SistemaDeAssinaturas {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Erik", "erik@hasfio.com");

        try {
            Assinatura assinatura = new Assinatura(usuario, TipoPlano.PREMIUM);

            System.out.println(assinatura.acessoAoSistema());
            assinatura.imprimirRelatorio();

            assinatura.alterarDatasParaTeste(LocalDate.of(2025,04,30));
            assinatura.acessoAoSistema();
            assinatura.imprimirRelatorio();
        } catch (AssinaturaExpiradaException | IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Sistema finalizado");
        }
    }
}
