package exercise.projetos.proj1.repositorio;

public enum TipoCliente {
    COMUM {
        @Override
        public double tipoCliente(double valor) {
            return valor;
        }
    },
    PREMIUM {
        @Override
        public double tipoCliente(double valor) {
            return valor -= valor * 0.10;
        }
    };

    public abstract double tipoCliente(double valor);
}
