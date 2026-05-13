package projects.ex06.main;

import projects.ex06.domain.Evento;
import projects.ex06.domain.Inscricao;
import projects.ex06.domain.Participante;
import projects.ex06.enums.TipoEvento;
import projects.ex06.service.ArquivoService;

public class Main {

    public static void main(String[] args) {

        Evento evento = new Evento("Marshmellow", TipoEvento.CURSO, "14/08/2026", 2, 199.90);
        Participante participante = new Participante("Erik", "erik._richard@gmail.com.br");
        Participante participante2 = new Participante("Erik", "erik1._richard@gmail.com.br");
        Participante participante3 = new Participante("Erik", "erik2._richard@gmail.com.br");
        Inscricao inscricao = new Inscricao();

        inscricao.adicionarEvento(evento);
        inscricao.inscreverParticipante(participante);
        inscricao.inscreverParticipante(participante2);
        inscricao.inscreverParticipante(participante3);

        ArquivoService arquivoService = new ArquivoService();

        arquivoService.salvarEventos(evento);
        arquivoService.salvarInscricores(inscricao);

        arquivoService.lerEvento();
        arquivoService.lerInscricao();


    }
}
