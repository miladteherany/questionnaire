package ir.teherany.exception;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class ErrorResponseDTO {
    private Date date;
    private String message;
}
