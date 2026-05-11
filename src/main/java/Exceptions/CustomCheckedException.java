package Exceptions;

public class CustomCheckedException extends Exception{
    public CustomCheckedException() {
        super("custom message");
    }

    @Override
    public String getMessage() {
        return "SOmething";
    }
}
