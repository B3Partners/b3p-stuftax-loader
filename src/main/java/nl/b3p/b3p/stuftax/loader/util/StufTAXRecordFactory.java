package nl.b3p.b3p.stuftax.loader.util;

import java.io.EOFException;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.HashMap;
import java.util.Map;
import nl.b3p.b3p.stuftax.loader.entity.*;

/**
 *
 * @author boy
 */
final class StufTAXRecordFactory {

    private static final Map<Integer, StufTAXRecord> RECORDS;

    static {
        RECORDS = new HashMap<Integer, StufTAXRecord>();

        RECORDS.put(0, new StufTAXRecord00());
        RECORDS.put(20, new StufTAXRecord1020());
        RECORDS.put(30, new StufTAXRecord1030());
        RECORDS.put(31, new StufTAXRecord1031());
        RECORDS.put(40, new StufTAXRecord1040());
        RECORDS.put(60, new StufTAXRecord1060());
        RECORDS.put(80, new StufTAXRecord1080());
        RECORDS.put(21, new StufTAXRecord1021());
        RECORDS.put(22, new StufTAXRecord1022());
        RECORDS.put(23, new StufTAXRecord1023());
        RECORDS.put(24, new StufTAXRecord1024());
        RECORDS.put(25, new StufTAXRecord1025());
        RECORDS.put(35, new StufTAXRecord1035());
        RECORDS.put(41, new StufTAXRecord1041());
        RECORDS.put(51, new StufTAXRecord1051());
        RECORDS.put(52, new StufTAXRecord1052());
        RECORDS.put(53, new StufTAXRecord1053());
        RECORDS.put(54, new StufTAXRecord1054());
        RECORDS.put(91, new StufTAXRecord1091());
        RECORDS.put(92, new StufTAXRecord1092());
    }

    private StufTAXRecordFactory() {
    }

    public static StufTAXRecord getNextRecord(LineNumberReader lineNumberReader)
            throws StufTAXParseException, IOException {

        String line = lineNumberReader.readLine();
        int recordType = Integer.parseInt(line.substring(0, 2));

        // laatste leveringsrecord, einde bestand
        if (recordType == 98) {
            throw new EOFException();
        }

        StufTAXRecord record = RECORDS.get(recordType);
        if (record != null) {
            record.fillValues(lineNumberReader, line);
        } else {
            throw new IOException("Unsupported record type: " + recordType);
        }

        return record;
    }
}