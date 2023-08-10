package ex4;

public class NoCapitalLetterException extends IncorrectPasswordException{
    public NoCapitalLetterException(String message ) {
        super(message);
    }
}
