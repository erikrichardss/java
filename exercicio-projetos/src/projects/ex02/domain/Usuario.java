package projects.ex02.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {

    private String nome;
    private String email;

    public Usuario(String nome, String email) {

        this.nome = nome;

        String regexEmail = "([\\w\\.])+@([\\w])+(\\.([\\w])+)+";
        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(email);

        if (!matcher.matches()) {

            throw new IllegalArgumentException("Email inválido");
        }
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }
}
