package cesaugusto108.course.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 2645501214975786464L;

    public DatabaseException(String message) {
        super(message);
    }
}
