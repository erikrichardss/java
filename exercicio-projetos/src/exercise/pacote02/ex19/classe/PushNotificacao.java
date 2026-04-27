package exercise.pacote02.ex19.classe;

import exercise.pacote02.ex19.Repositorio.Notificacao;

public class PushNotificacao implements Notificacao {
    private String dispositivoId;
    private boolean enviada;

    public PushNotificacao(String dispositivoId) {
        this.dispositivoId = dispositivoId;
        this.enviada = false;
    }

    @Override
    public void enviar(String mensagem) {
        if (mensagem != null) {
            System.out.println("Enviando e-mail para " + getDispositivoId());
            System.out.println("Mensagem: " + mensagem);
            this.enviada = true;
        } else {
            System.out.println("Campo vazio");
            return;
        }
    }

    @Override
    public String getTipo() {
        return "push";
    }

    public String getDispositivoId() {
        return dispositivoId;
    }

    public void setDispositivoId(String dispositivoId) {
        this.dispositivoId = dispositivoId;
    }

    public boolean isEnviada() {
        return enviada;
    }

    public void setEnviada(boolean enviada) {
        this.enviada = enviada;
    }
}
