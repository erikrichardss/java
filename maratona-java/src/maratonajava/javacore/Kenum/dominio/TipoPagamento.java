package maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO {
        @Override
        public double tipoPagamento(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double tipoPagamento(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double tipoPagamento(double valor);
}