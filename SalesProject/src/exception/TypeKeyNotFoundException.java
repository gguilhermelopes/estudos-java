package exception;

public class TypeKeyNotFoundException extends Exception{
    public TypeKeyNotFoundException(String message){
        this(message, null);
    }

    public TypeKeyNotFoundException(String message, Throwable error) {
        super(message, error);
    }
}
