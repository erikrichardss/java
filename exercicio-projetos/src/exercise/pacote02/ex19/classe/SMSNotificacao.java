package exercise.pacote02.ex19.classe;

import exercise.pacote02.ex19.Repositorio.Notificacao;

public class SMSNotificacao implements Notificacao {
    private String numeroTelefone;
    private boolean enviada;

    public SMSNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
        this.enviada = false;
    }

    @Override
    public void enviar(String mensagem) {
        if (mensagem != null) {
            System.out.println("Enviando sms para " + getNumeroTelefone());
            System.out.println("Mensagem: " + mensagem);
            this.enviada = true;
        } else {
            System.out.println("Campo vazio");
            return;
        }
    }

    @Override
    public String getTipo() {
        return "sms";
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public boolean isEnviada() {
        return enviada;
    }

    public void setEnviada(boolean enviada) {
        this.enviada = enviada;
    }
}
