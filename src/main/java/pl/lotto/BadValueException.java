package pl.lotto;

public class BadValueException extends RuntimeException {
    public BadValueException(String message) {
        super(message);
    }
}
