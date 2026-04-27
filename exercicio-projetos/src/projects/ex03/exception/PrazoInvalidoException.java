package projects.ex03.exception;

public class PrazoInvalidoException extends RuntimeException {
    public PrazoInvalidoException(String message) {
        super(message);
    }
}
