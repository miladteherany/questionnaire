package ir.teherany.exception;

import org.springframework.http.HttpStatus;

public abstract class BaseException extends RuntimeException {
    public BaseException(String message) {
        super(message);
    }

    abstract String getMessageKey();

    abstract HttpStatus httpStatus();
}
