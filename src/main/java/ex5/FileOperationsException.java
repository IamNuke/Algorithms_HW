package ex5;

public class FileOperationsException extends Exception{
    public FileOperationsException(String message, Exception e) {
        super(message, e);
    }
}
