package projects.ex01.model;

import projects.ex01.enums.TipoPlano;
import projects.ex01.exception.AcessoNegadoException;
import projects.ex01.interfaces.GestaoFinanceira;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoAcademia implements GestaoFinanceira {

    private List <Membro> membros = new ArrayList<>();
    private boolean acessoAcademia;

    public void cadastrarMembro(List <Membro> membro) {

        membro = new ArrayList<>();

        this.membros = membro;
    }

    public Period vencimentoDoPlano(Membro membro) {

        return Period.between(LocalDate.now(), membro.getDataExpiracao());
    }

    public boolean registrarEntradaAcademia(Membro membro) {

        if (LocalDate.now().isAfter(membro.getDataExpiracao())) {

            this.acessoAcademia = false;
            throw new AcessoNegadoException("Plano excedido!");
        }


        System.out.println("Acesso liberado");
        this.acessoAcademia = true;

        return this.acessoAcademia;
    }

    @Override
    public double aplicarValorComDesconto(double percentual) {

        double valorComDesconto = 0;
        for (Membro membro : membros) {

            if (membro.getTipoPlano() == TipoPlano.GOLD) {

                valorComDesconto += membro.getTipoPlano().getMensalidade() * percentual;
            }
        }

        return valorComDesconto;
    }

    public List<Membro> getMembros() {
        return membros;
    }

    public boolean isAcessoAcademia() {
        return acessoAcademia;
    }
}
