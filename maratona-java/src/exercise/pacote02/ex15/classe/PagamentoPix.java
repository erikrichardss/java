package exercise.pacote02.ex15.classe;

public class PagamentoPix implements Pagamento{
    private String chavePix;
    private boolean concluido;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
        this.concluido = false;
    }

    @Override
    public void processar(double valor) {
        if (valor >= 10) {
            this.concluido = true;
        } else {
            System.out.println("Somente com valores acima ou igauis a 10");
            return;
        }
    }

    @Override
    public void cancelar() {
        if (this.concluido == true) {
            this.concluido = false;
        } else {
            System.out.println("É preciso ter concluido");
            return;
        }
    }

    @Override
    public boolean estarConcluido() {
        return isConcluido();
    }

    public String getChavePix() {
        return chavePix;
    }

    public boolean isConcluido() {
        return concluido;
    }
}
