package exercise.pacote02.ex26.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        String regexNome = "([a-zA-Z\\s])";
        String regexEmail = "([\\w\\.\\-\\_])+@([a-z])+(\\.([a-z])+)+";
        String regexTelefone = "(\\(\\d{2}\\))+\\s(\\d{5})+-(\\d{4})";

        String nome = "Erik Silva";
        String email = "erik.silva@gmail.com";
        String telefone = "(38) 99999-1234";

        Pattern patternNome = Pattern.compile(regexNome);
        Matcher matcherNome = patternNome.matcher(nome);

        Pattern patternEmail = Pattern.compile(regexEmail);
        Matcher matcherEmail = patternEmail.matcher(email);

        Pattern patternTelefone = Pattern.compile(regexTelefone);
        Matcher matcherTelefone = patternTelefone.matcher(telefone);

        if (matcherNome.find()) {

            System.out.println("Nome válido!");
            while (matcherNome.find()) {

                System.out.print(matcherNome.group());
            }
            System.out.println();
        } else {

            System.out.println("Nome Inválido!");
        }

        if (matcherEmail.find()) {

            System.out.println("Email válido");
            while (matcherEmail.find()) {

                System.out.print(matcherEmail.group());
            }
            System.out.println();
        } else {

            System.out.println("Email Inválido!");
        }

        if (matcherTelefone.find()) {

            while (matcherTelefone.find()) {

                System.out.print(matcherTelefone.group());
            }
            System.out.println("Telefone válido");
        } else {

            System.out.println("Telefone Inválido!");
        }
    }
}
