package exercise.pacote02.ex16.classe;

public class Assinatura {
    private Plano plano;
    private StatusAssinatura statusAssinatura;
    private int mesesEmAtraso;

    public Assinatura(Plano plano) {
        this.plano = plano;
        this.statusAssinatura = StatusAssinatura.ATIVA;
        this.mesesEmAtraso = 0;
    }

    public void registrarAtraso() {
        this.mesesEmAtraso++;

        if (!StatusAssinatura.CANCELADA.equals(this.statusAssinatura)) {
            if (this.mesesEmAtraso >= 2) {
                this.statusAssinatura = StatusAssinatura.SUSPENSA;
            }
        } else {
            System.out.println("Assinatura foi cancelada.");
        }
    }

    public void pagarMensalidade() {
        this.mesesEmAtraso = 0;

        if (StatusAssinatura.SUSPENSA.equals(this.statusAssinatura)) {
            this.statusAssinatura = StatusAssinatura.ATIVA;
        }

        if (StatusAssinatura.CANCELADA.equals(this.statusAssinatura)) {
            System.out.println("Assinatura cancelada, não pode pagar.");
        }
    }

    public void cancelar() {
        if (!StatusAssinatura.SUSPENSA.equals(this.statusAssinatura)) {
            if (!StatusAssinatura.CANCELADA.equals(this.statusAssinatura)) {
                this.statusAssinatura = StatusAssinatura.CANCELADA;
            }
        } else {
            System.out.println("É preciso pagar a assinatura antes de cancelar");
        }
    }

    public void novoPlano(Plano plano) {
        if (StatusAssinatura.ATIVA.equals(this.statusAssinatura)) {
            this.plano = plano;
        }

        if (StatusAssinatura.SUSPENSA.equals(this.statusAssinatura) || StatusAssinatura.CANCELADA.equals(this.statusAssinatura)) {
            System.out.println("Não é possivel mudar o plano.");
            return;
        }
    }

    public void imprimirAssinatura() {
        System.out.println("Plano: " + getPlano().getNome() +
                ", status: " + getStatusAssinatura());
    }

    public boolean podeAssistir() {
        if (StatusAssinatura.ATIVA.equals(this.statusAssinatura)) {
            return true;
        }
        return false;
    }

    public Plano getPlano() {
        return plano;
    }

    public StatusAssinatura getStatusAssinatura() {
        return statusAssinatura;
    }

    public int getMesesEmAtraso() {
        return mesesEmAtraso;
    }
}
