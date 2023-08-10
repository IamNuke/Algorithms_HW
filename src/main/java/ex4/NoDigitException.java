package ex4;

public class NoDigitException extends IncorrectPasswordException{
    public NoDigitException(String message) {
        super(message);
    }
}
