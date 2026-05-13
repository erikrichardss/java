package projects.ex06.domain;

import projects.ex06.enums.StatusInscriao;
import projects.ex06.exception.EventoLotadoException;
import projects.ex06.exception.InscricaoDuplicadaException;

import java.time.LocalDate;
import java.util.*;

public class Inscricao {

    private Set<Participante> participanteSet = new HashSet<>();;
    private Evento evento;
    private StatusInscriao statusInscricao;
    private LocalDate dataInscricao;

    public void inscreverParticipante(Participante participante) {

        if (this.participanteSet.size() == this.evento.getCapacidadeMaxima()) {

            throw new EventoLotadoException("Evento lotado");
        }

        boolean adicinou = this.participanteSet.add(participante);

        if (!adicinou) {

            throw new InscricaoDuplicadaException("Usuário já inscrito");
        }

        this.participanteSet.add(participante);
        this.statusInscricao = StatusInscriao.ATIVA;
    }

    public void cancelarInscricao(Participante participante) {

        if (!this.participanteSet.contains(participante)) {

            throw new IllegalArgumentException("Usuário não existe");
        }

        Iterator<Participante> participanteIterator = this.participanteSet.iterator();

        while (participanteIterator.hasNext()) {

            if (participanteIterator.next().equals(participante)) {

                participanteIterator.remove();
            }
        }

        this.statusInscricao = StatusInscriao.CANCELADA;
    }

    public List<Participante> ordenarParticipantePorData() {

        List<Participante> participanteList = new ArrayList<>(this.participanteSet);

        participanteList.sort(Comparator.comparing(Participante::getDataCadastro));

        return participanteList;
    }

    public List<Participante> ordenarParticipantePorNome() {

        List<Participante> participanteList = new ArrayList<>(this.participanteSet);

        participanteList.sort(Comparator.comparing(Participante::getNome));

        return participanteList;
    }

    public void adicionarEvento(Evento evento) {

        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Inscricao{" +
                "participanteSet=" + participanteSet +
                ", evento=" + evento.getTipoEvento().getNome() +
                ", statusInscricao=" + statusInscricao.getNome() +
                ", dataInscricao=" + dataInscricao +
                '}';
    }

    public Set<Participante> getParticipanteSet() {
        return participanteSet;
    }

    public Evento getEvento() {
        return evento;
    }

    public StatusInscriao getStatusInscricao() {
        return statusInscricao;
    }

    public LocalDate getDataInscricao() {
        return dataInscricao;
    }
}
