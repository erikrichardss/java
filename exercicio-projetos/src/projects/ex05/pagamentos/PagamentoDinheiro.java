package projects.ex05.pagamentos;

import projects.ex05.interfaces.Pagavel;

public class PagamentoDinheiro implements Pagavel {

    @Override
    public double processarPagamento(double valor) {

        return valor;
    }
}
