package nl.b3p.b3p.stuftax.loader.entity;

import java.io.LineNumberReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author boy
 */
public abstract class StufTAXRecord {

    protected String line;
    protected LineNumberReader lineNumberReader;
    
    protected String identifCode;
    protected String deelbestandCode; // only used in stuur records    

    public String getString(int startPos, int length, String line) {
        String s = null;
        if (line != null) {
            s = line.substring(startPos - 1, (startPos - 1) + length).trim();
        
            if (s != null && s.isEmpty()) {
                return null;
            }
        }

        return s;
    }

    public Integer getNumber(int startPos, int length, String line) {
        Integer nr = null;
        if (line != null) {
            String val = line.substring(startPos - 1, (startPos - 1) + length);
            nr = new Integer(val);
        }

        return nr;
    }
    
    public Long getLong(int startPos, int length, String line) {
        Long nr = null;
        if (line != null) {
            String val = line.substring(startPos - 1, (startPos - 1) + length);
            nr = new Long(val);
        }

        return nr;
    }

    public Date getDate(int startPos, int length, String line) {
        Date date = null;
        if (line != null) {
            String val = line.substring(startPos - 1, (startPos - 1) + length);

            DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            try {
                date = formatter.parse(val);
            } catch (ParseException ex) {
            }
        }

        return date;
    }

    public String getIdentifCode() {
        return identifCode;
    }

    public void setIdentifCode(String identifCode) {
        this.identifCode = identifCode;
    }

    public String getDeelbestandCode() {
        return deelbestandCode;
    }

    public void setDeelbestandCode(String deelbestandCode) {
        this.deelbestandCode = deelbestandCode;
    }
}