package nl.b3p.b3p.stuftax.loader.util;

import java.io.EOFException;
import java.io.IOException;
import java.io.LineNumberReader;
import nl.b3p.b3p.stuftax.loader.entity.*;

/**
 *
 * @author boy
 */
public class StufTAXRecordFactory {

    public static StufTAXRecord getNextRecord(LineNumberReader lineNumberReader) throws StufTAXParseException, IOException {
        String line = lineNumberReader.readLine();
        int recordType = Integer.parseInt(line.substring(0, 2));

        switch (recordType) {
            case 0:
                return new StufTAXRecord00(lineNumberReader, line);
            case 20:
                return new StufTAXRecord1020(lineNumberReader, line);
            case 30:
                return new StufTAXRecord1030(lineNumberReader, line);
            case 31:
                return new StufTAXRecord1031(lineNumberReader, line);
            case 40:
                return new StufTAXRecord1040(lineNumberReader, line);
            case 60:
                return new StufTAXRecord1060(lineNumberReader, line);
            case 80:
                return new StufTAXRecord1080(lineNumberReader, line);
            case 21:
                return new StufTAXRecord1021(lineNumberReader, line);
            case 22:
                return new StufTAXRecord1022(lineNumberReader, line);
            case 23:
                return new StufTAXRecord1023(lineNumberReader, line);
            case 24:
                return new StufTAXRecord1024(lineNumberReader, line);
            case 25:
                return new StufTAXRecord1025(lineNumberReader, line);
            case 35:
                return new StufTAXRecord1035(lineNumberReader, line);
            case 41:
                return new StufTAXRecord1041(lineNumberReader, line);
            case 51:
                return new StufTAXRecord1051(lineNumberReader, line);
            case 52:
                return new StufTAXRecord1052(lineNumberReader, line);
            case 53:
                return new StufTAXRecord1053(lineNumberReader, line);
            case 54:
                return new StufTAXRecord1054(lineNumberReader, line);
            case 91:
                return new StufTAXRecord1091(lineNumberReader, line);
            case 92:
                return new StufTAXRecord1092(lineNumberReader, line);
            case 98:
                throw new EOFException();
            default:
                throw new IOException("Unsupported record type: " + recordType);
        }
    }
}