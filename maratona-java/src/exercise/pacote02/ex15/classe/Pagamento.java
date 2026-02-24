package exercise.pacote02.ex15.classe;

public interface Pagamento {
    public void processar(double valor);
    public void cancelar();
    public boolean estarConcluido();
}
