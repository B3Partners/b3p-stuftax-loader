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
@Table(name = "stax_status_beschikking")
public class StufTAXRecord1080 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="waarde_peildatum")
    private Date waardePeilDatum;    
    
    @Column(name="code_status_beschikking")
    private Integer codeStatusBeschikking;
    
    @Column(name="mutatiecode")
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;
    
    @Column(name="anummer_nat_persoon")
    private Long aNummerNatuurlijkpersoon;
    
    @Column(name="sofinummer")
    private Integer sofinummer;
    
    @Column(name="aanvulling_sofinummer")
    private Integer aanvullingSofinummer;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="datum_status")
    private Date datumStatus;

    public StufTAXRecord1080() {
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

    public Date getWaardePeilDatum() {
        return waardePeilDatum;
    }

    public void setWaardePeilDatum(Date waardePeilDatum) {
        this.waardePeilDatum = waardePeilDatum;
    }

    public Integer getCodeStatusBeschikking() {
        return codeStatusBeschikking;
    }

    public void setCodeStatusBeschikking(Integer codeStatusBeschikking) {
        this.codeStatusBeschikking = codeStatusBeschikking;
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

    public Long getaNummerNatuurlijkpersoon() {
        return aNummerNatuurlijkpersoon;
    }

    public void setaNummerNatuurlijkpersoon(Long aNummerNatuurlijkpersoon) {
        this.aNummerNatuurlijkpersoon = aNummerNatuurlijkpersoon;
    }

    public Integer getSofinummer() {
        return sofinummer;
    }

    public void setSofinummer(Integer sofinummer) {
        this.sofinummer = sofinummer;
    }

    public Integer getAanvullingSofinummer() {
        return aanvullingSofinummer;
    }

    public void setAanvullingSofinummer(Integer aanvullingSofinummer) {
        this.aanvullingSofinummer = aanvullingSofinummer;
    }

    public Date getDatumStatus() {
        return datumStatus;
    }

    public void setDatumStatus(Date datumStatus) {
        this.datumStatus = datumStatus;
    }

    @Override
    public void fillValues(LineNumberReader lineNumberReader, String line) {
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.waardePeilDatum = getDate(15, 8, line);
        this.codeStatusBeschikking = getNumber(25, 2, line);
        this.mutatiecode = getString(27, 1, line);
        this.ingangsDatum = getDate(28, 8, line);
        this.eindDatum = getDate(36, 8, line);
        this.aNummerNatuurlijkpersoon = getLong(44, 10, line);
        this.sofinummer = getNumber(54, 9, line);
        this.aanvullingSofinummer = getNumber(63, 10, line);
        this.datumStatus = getDate(73, 8, line);
    }
}