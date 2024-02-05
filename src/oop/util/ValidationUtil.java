package oop.util;

import oop.data.LoginRequest;
import oop.error.BlankException;
import oop.error.ValidationException;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is Null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationException("Username is Blank");
        } else if (loginRequest.password().isBlank()) {
            throw new ValidationException("Password is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is Null");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if (loginRequest.username() == null) {
            throw new NullPointerException("Username is Null");
        } else if (loginRequest.username().isBlank()) {
            throw new BlankException("Username is Blank");
        } else if (loginRequest.password().isBlank()) {
            throw new BlankException("Password is Blank");
        } else if (loginRequest.password() == null) {
            throw new NullPointerException("Password is Null");
        }
    }
}
