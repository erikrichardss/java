package projects.ex04.main;

import projects.ex04.domain.SecaoEstudos;
import projects.ex04.enums.TipoEstudo;
import projects.ex04.service.DiarioService;

public class SistemaDiarioEstudo {

    public static void main(String[] args) {

        criarSecaoEstudo();
    }

    public static void criarSecaoEstudo() {

        SecaoEstudos secaoEstudos = new SecaoEstudos("Estudar fundamentos essenciais", TipoEstudo.BANCODEDADOS, 30);
        DiarioService diarioService = new DiarioService();

        diarioService.criarSecao(secaoEstudos);
        diarioService.lerArquivo();
    }
}
