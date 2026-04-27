package exercise.projetos.proj3.repositorio;

public enum TipoCliente {
    COMUM {
        @Override
        public double limite(double limite) {
            return limite;
        }
    },
    VIP {
        @Override
        public double limite(double limite) {
            return limite * 2;
        }
    };

    public abstract double limite(double limite);
}
