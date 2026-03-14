package maratonajava.javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Peesoa{
    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException {
        super.salvar();
    }
}
