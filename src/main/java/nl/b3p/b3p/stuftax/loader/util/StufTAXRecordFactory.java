package nl.b3p.b3p.stuftax.loader.util;

import java.io.IOException;
import java.io.Reader;
import nl.b3p.b3p.stuftax.loader.entity.*;

/**
 *
 * @author boy
 */
final class StufTAXRecordFactory {

    private StufTAXRecordFactory() {
    }

    public static StufTAXRecord getNextRecord(Reader reader, int count)
            throws StufTAXParseException, IOException {

        char[] buf = new char[256];
        reader.read(buf, 0, 256);
        String line = new String(buf);
        
        int recordType = Integer.parseInt(line.substring(0, 2));
        
        StufTAXRecord record = null;
        switch (recordType) {
            case 0:
                record = new StufTAXRecord00();
                break;
            case 20:
                record = new StufTAXRecord1020();
                break;
            case 21:
                record = new StufTAXRecord1021();
                break;
            case 22:
                record = new StufTAXRecord1022();
                break;
            case 23:
                record = new StufTAXRecord1023();
                break;
            case 24:
                record = new StufTAXRecord1024();
                break;
            case 25:
                record = new StufTAXRecord1025();
                break;
            case 30:
                record = new StufTAXRecord1030();
                break;
            case 31:
                record = new StufTAXRecord1031();
                break;
            case 35:
                record = new StufTAXRecord1035();
                break;
            case 40:
                record = new StufTAXRecord1040();
                break;
            case 41:
                record = new StufTAXRecord1041();
                break;
            case 51:
                record = new StufTAXRecord1051();
                break;
            case 52:
                record = new StufTAXRecord1052();
                break;
            case 53:
                record = new StufTAXRecord1053();
                break;
            case 54:
                record = new StufTAXRecord1054();
                break;
            case 60:
                record = new StufTAXRecord1060();
                break;
            case 80:
                record = new StufTAXRecord1080();
                break;
            case 91:
                record = new StufTAXRecord1091();
                break;
            case 92:
                record = new StufTAXRecord1092();
                break;
            case 98:
                record = new StufTAXTotalenRecord();
                break;
            default:
                throw new IOException("Recordtype " + recordType + " onbekend!");
        }

        if (record != null) {
            record.fillValues(count, line);
        }

        return record;
    }
}