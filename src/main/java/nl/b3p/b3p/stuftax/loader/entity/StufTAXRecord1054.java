package nl.b3p.b3p.stuftax.loader.entity;

import java.io.LineNumberReader;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author boy
 */
@Entity
@Table(name = "stuftax_54")
public class StufTAXRecord1054 extends StufTAXRecord implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="volgnummer_marktgegeven")
    private Integer volgnummerMarktgegeven;
    
    @Column(name="kad_gemeente_code")
    private String kadasterGemeenteCode;
    
    @Column(name="sectie")
    private String sectie;
    
    @Column(name="perceelnummer")
    private Integer perceelnummer;
    
    @Column(name="perceel_indexletter")
    private String perceelIndexLetter;
    
    @Column(name="perceel_indexnummer")
    private Integer perceelIndexNummer;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;

    public StufTAXRecord1054() {
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

    public Integer getVolgnummerMarktgegeven() {
        return volgnummerMarktgegeven;
    }

    public void setVolgnummerMarktgegeven(Integer volgnummerMarktgegeven) {
        this.volgnummerMarktgegeven = volgnummerMarktgegeven;
    }

    public String getKadasterGemeenteCode() {
        return kadasterGemeenteCode;
    }

    public void setKadasterGemeenteCode(String kadasterGemeenteCode) {
        this.kadasterGemeenteCode = kadasterGemeenteCode;
    }

    public String getSectie() {
        return sectie;
    }

    public void setSectie(String sectie) {
        this.sectie = sectie;
    }

    public Integer getPerceelnummer() {
        return perceelnummer;
    }

    public void setPerceelnummer(Integer perceelnummer) {
        this.perceelnummer = perceelnummer;
    }

    public String getPerceelIndexLetter() {
        return perceelIndexLetter;
    }

    public void setPerceelIndexLetter(String perceelIndexLetter) {
        this.perceelIndexLetter = perceelIndexLetter;
    }

    public Integer getPerceelIndexNummer() {
        return perceelIndexNummer;
    }

    public void setPerceelIndexNummer(Integer perceelIndexNummer) {
        this.perceelIndexNummer = perceelIndexNummer;
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
        
        this.volgnummerMarktgegeven = getNumber(3, 8, line);
        this.kadasterGemeenteCode = getString(11, 5, line);
        this.sectie = getString(16, 2, line);
        this.perceelnummer = getNumber(18, 5, line);
        this.perceelIndexLetter = getString(23, 1, line);
        this.perceelIndexNummer = getNumber(24, 4, line);
        this.mutatiecode = getString(28, 1, line);
        this.ingangsDatum = getDate(29, 8, line);
        this.eindDatum = getDate(37, 8, line);
    }
}