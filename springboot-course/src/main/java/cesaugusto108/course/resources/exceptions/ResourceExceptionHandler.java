package cesaugusto108.course.resources.exceptions;

import cesaugusto108.course.services.exceptions.DatabaseException;
import cesaugusto108.course.services.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFoundHandler(ResourceNotFoundException resourceNotFoundException, HttpServletRequest httpServletRequest) {
        String error = "Resource not found.";
        HttpStatus httpStatus = HttpStatus.NOT_FOUND;
        StandardError standardError = new StandardError(Instant.now(), httpStatus.value(), error, resourceNotFoundException.getMessage(), httpServletRequest.getRequestURI());

        return ResponseEntity.status(httpStatus).body(standardError);
    }

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<StandardError> databaseExceptionHandler(DatabaseException databaseException, HttpServletRequest httpServletRequest) {
        String error = "Database error.";
        HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
        StandardError standardError = new StandardError(Instant.now(), httpStatus.value(), error, databaseException.getMessage(), httpServletRequest.getRequestURI());

        return ResponseEntity.status(httpStatus).body(standardError);
    }
}
