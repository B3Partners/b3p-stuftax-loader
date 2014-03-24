package nl.b3p.b3p.stuftax.loader.entity;

import java.io.LineNumberReader;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author boy
 */
@Entity
@Table(name = "stax_sluimer_woz")
public class StufTAXRecord1041 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="woz_objectnummer_sluimer")
    private Long wozObjectNummerSluimer;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;    

    public StufTAXRecord1041() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public Long getWozObjectNummer() {
        return wozObjectNummer;
    }

    public void setWozObjectNummer(Long wozObjectNummer) {
        this.wozObjectNummer = wozObjectNummer;
    }

    public Long getWozObjectNummerSluimer() {
        return wozObjectNummerSluimer;
    }

    public void setWozObjectNummerSluimer(Long wozObjectNummerSluimer) {
        this.wozObjectNummerSluimer = wozObjectNummerSluimer;
    }

    public String getMutatiecode() {
        return mutatiecode;
    }

    public void setMutatiecode(String mutatiecode) {
        this.mutatiecode = mutatiecode;
    }

    public Date getIngangsDatum() {
        return ingangsDatum;
    }

    public void setIngangsDatum(Date ingangsDatum) {
        this.ingangsDatum = ingangsDatum;
    }

    public Date getEindDatum() {
        return eindDatum;
    }

    public void setEindDatum(Date eindDatum) {
        this.eindDatum = eindDatum;
    }

    @Override
    public void fillValues(LineNumberReader lineNumberReader, String line) {
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.wozObjectNummerSluimer = getLong(15, 12, line);
        this.mutatiecode = getString(27, 1, line);
        this.ingangsDatum = getDate(28, 8, line);
        this.eindDatum = getDate(36, 8, line);
    }
}