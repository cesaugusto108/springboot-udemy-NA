package cesaugusto108.course.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = -5035522040223628392L;

    public ResourceNotFoundException(Object id) {

        super("Resource not found: id " + id);
    }
}
