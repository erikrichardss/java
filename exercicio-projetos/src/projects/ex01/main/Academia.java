package projects.ex01.main;

import projects.ex01.model.GerenciamentoAcademia;
import projects.ex01.model.Membro;
import projects.ex01.enums.TipoPlano;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    public static void main(String[] args) {

        List<Membro> membros = new ArrayList<>();

        GerenciamentoAcademia gerenciarAcademia = new GerenciamentoAcademia();

        gerenciarAcademia.cadastrarMembro(membros);

        try {

            Membro membro1 = new Membro("Erik", "asi@uyofg.com.nu", TipoPlano.BASIC);
            Membro membro2 = new Membro("Ana", "asi@uyofg.com.nu", TipoPlano.GOLD);
            Membro membro3 = new Membro("Milene", "asi@uyofg.com.nu", TipoPlano.SILVER);
            Membro membro4 = new Membro("Larissa", "asi@uyofg.com.nu", TipoPlano.SILVER);
            Membro membro5 = new Membro("Carlos", "asi@uyofg.com.nu", TipoPlano.GOLD);

            membros.add(membro1);
            membros.add(membro2);
            membros.add(membro3);
            membros.add(membro4);
            membros.add(membro5);

            gerenciarAcademia.registrarEntradaAcademia(membro1);
            gerenciarAcademia.registrarEntradaAcademia(membro2);
            gerenciarAcademia.registrarEntradaAcademia(membro3);
            gerenciarAcademia.registrarEntradaAcademia(membro4);
            gerenciarAcademia.registrarEntradaAcademia(membro5);
        } catch (RuntimeException e) {

            System.out.println("Erro: " + e.getMessage());
        } finally {

            System.out.println("Cadastro Finalizado");
        }
    }
}
