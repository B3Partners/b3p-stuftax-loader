package nl.b3p.b3p.stuftax.loader.util;

import java.io.LineNumberReader;

/**
 *
 * @author boy
 */
public class StufTAXParseException extends Exception {

    private String message;

    public StufTAXParseException(LineNumberReader reader, String message) {
        super();
        this.message = "line " + reader.getLineNumber() + ": " + message;
    }

    public StufTAXParseException(LineNumberReader reader, String message, Exception cause) {
        super(cause);
        this.message = "entry starting at line " + reader.getLineNumber() + ": " + message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
