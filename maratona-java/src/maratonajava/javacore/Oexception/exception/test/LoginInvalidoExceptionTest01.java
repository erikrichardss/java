package maratonajava.javacore.Oexception.exception.test;

import maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar()
        throws LoginInvalidoException {

        Scanner teclado = new Scanner(System.in);

        String usernameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitado = teclado.nextLine();

        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitado)) {
            throw new LoginInvalidoException("Login ou senha inválido");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
