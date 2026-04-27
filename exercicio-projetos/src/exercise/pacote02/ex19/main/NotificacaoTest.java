package exercise.pacote02.ex19.main;

import exercise.pacote02.ex19.Repositorio.Notificacao;
import exercise.pacote02.ex19.classe.CentralNotificacao;
import exercise.pacote02.ex19.classe.EmailNotificacao;
import exercise.pacote02.ex19.classe.PushNotificacao;
import exercise.pacote02.ex19.classe.SMSNotificacao;

public class NotificacaoTest {
    public static void main(String[] args) {
        EmailNotificacao emailNotificacao = new EmailNotificacao("erik@986123.com");
        SMSNotificacao smsNotificacao = new SMSNotificacao("(31) 97623-2349");
        Notificacao pushNotificacao = new PushNotificacao("129836");

        Notificacao[] notificacoes = {emailNotificacao, smsNotificacao, pushNotificacao};

        CentralNotificacao centralNotificacao = new CentralNotificacao();

        for (Notificacao notificacao : notificacoes) {
            centralNotificacao.notificar(notificacao, "Mensagem importante");
        }

        System.out.println("Total mensagens: " + CentralNotificacao.getTotalEnviadas());
    }
}
