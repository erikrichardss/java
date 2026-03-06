package exercise.pacote02.ex19.classe;

import exercise.pacote02.ex19.Repositorio.Notificacao;

public class EmailNotificacao implements Notificacao {
    private String emailDestino;
    private boolean enviada;

    public EmailNotificacao(String emailDestino) {
        this.emailDestino = emailDestino;
        this.enviada = false;
    }

    @Override
    public void enviar(String mensagem) {
        if (mensagem != null) {
            System.out.println("Enviando e-mail para " + getEmailDestino());
            System.out.println("Mensagem: " + mensagem);
            this.enviada = true;
        } else {
            System.out.println("Campo vazio");
            return;
        }
    }

    @Override
    public String getTipo() {
        return "email";
    }

    public String getEmailDestino() {
        return emailDestino;
    }

    public void setEmailDestino(String emailDestino) {
        this.emailDestino = emailDestino;
    }

    public boolean isEnviada() {
        return enviada;
    }
}
