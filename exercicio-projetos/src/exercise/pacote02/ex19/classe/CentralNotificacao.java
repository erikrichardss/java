package exercise.pacote02.ex19.classe;

import exercise.pacote02.ex19.Repositorio.Notificacao;

public class CentralNotificacao {
    private static int totalEnviadas = 0;

    public void notificar(Notificacao notificacao, String mensagem) {
        notificacao.enviar(mensagem);
        CentralNotificacao.totalEnviadas++;

        System.out.println("Tipo da notificacao: " + notificacao.getTipo());
        System.out.println("-----------------------");
    }

    public static int getTotalEnviadas() {
        return totalEnviadas;
    }
}
