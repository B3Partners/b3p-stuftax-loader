package nl.b3p.b3p.stuftax.loader.util;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Iterator;
import nl.b3p.b3p.stuftax.loader.entity.StufTAXRecord;
import org.apache.commons.io.input.CountingInputStream;

/**
 *
 * @author boy
 */
public class StufTAXRecordCollector implements Iterator<StufTAXRecord> {    
    
    private StufTAXRecord record;
    private Reader reader;
    private CountingInputStream cis;
    private int count;

    public StufTAXRecordCollector(URL url) throws IOException, StufTAXParseException {
        this.cis = new CountingInputStream(url.openStream());
        this.reader = new InputStreamReader(cis);
        count = 0;
    }
    
    @Override
    public StufTAXRecord next() {
        return record;
    }

    @Override
    public boolean hasNext() {
        try {
            count++;
            record = StufTAXRecordFactory.getNextRecord(reader, count);
            return record != null;
        } catch (EOFException ex) {
            return false;
        } catch (Exception ex) {
            return this.hasNext();
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void close() throws IOException {
        reader.close();
    }

    public long getByteCount() {
        return cis.getByteCount();
    }

    public int getLineNumber() {
        return count;
    }
}