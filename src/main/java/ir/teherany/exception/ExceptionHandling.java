package ir.teherany.exception;

import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Date;
import java.util.Locale;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ExceptionHandling {
    private MessageSource messageSource;

    public ExceptionHandling(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler
    public ResponseEntity<ErrorResponseDTO> errorResponseDTOResponseEntity(MethodArgumentNotValidException exception) {
        String message = exception.getBindingResult().getFieldErrors().stream()
                .map(fieldError -> messageSource.getMessage(fieldError.getDefaultMessage(), null, Locale.ENGLISH)).collect(Collectors.joining(","));
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO().setDate(new Date()).setMessage(message);
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }
}
