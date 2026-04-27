package projects.ex05.domain;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cliente {


    private String nome;
    private String email;
    private LocalDate dataCadastro;

    public Cliente(String nome, String email) {

        this.nome = nome;
        this.dataCadastro = LocalDate.now();

        String regexEmail = "([\\w\\-])+@([\\w])+(\\.([\\w])+)+";
        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(email);

        if (!matcherEmail.matches()) {

            throw new IllegalArgumentException(
                    "Email inválido");
        }

        this.email = email;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(dataCadastro, cliente.dataCadastro);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, dataCadastro);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
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
