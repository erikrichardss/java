package projects.ex06.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Participante {

    private String nome;
    private String email;
    private LocalDate dataCadastro;

    public Participante(String nome, String email) {

        this.nome = nome;

        Pattern emailPattern = Pattern.compile("([\\w\\-._])+@([\\w])+(.([\\w])+)+");
        Matcher emailMatcher = emailPattern.matcher(email);

        if (!emailMatcher.matches()) {

            throw new IllegalArgumentException("Email inválido");
        }

        this.email = email;
        this.dataCadastro = LocalDate.now();
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {

        return Objects.hashCode(email);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
}
