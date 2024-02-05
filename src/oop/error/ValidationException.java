package oop.error;

public class ValidationException extends Throwable {
    // counstract
    public ValidationException(String message) {
        super(message);
    }
}
