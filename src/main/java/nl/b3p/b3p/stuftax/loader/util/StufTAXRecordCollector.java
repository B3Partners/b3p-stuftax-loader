package nl.b3p.b3p.stuftax.loader.util;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
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
    private LineNumberReader lineNumberReader;
    private CountingInputStream cis;

    public StufTAXRecordCollector(URL url) throws IOException, StufTAXParseException {
        this.cis = new CountingInputStream(url.openStream());
        this.lineNumberReader = new LineNumberReader(new InputStreamReader(cis));
    }
    
    @Override
    public StufTAXRecord next() {
        return record;
    }

    @Override
    public boolean hasNext() {
        try {
            record = StufTAXRecordFactory.getNextRecord(lineNumberReader);
            
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
        lineNumberReader.close();
    }

    public long getByteCount() {
        return cis.getByteCount();
    }

    public int getLineNumber() {
        return lineNumberReader.getLineNumber();
    }
}