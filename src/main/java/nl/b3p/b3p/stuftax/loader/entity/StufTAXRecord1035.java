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
@Table(name = "stuftax_35")
public class StufTAXRecord1035 extends StufTAXRecord implements Serializable {
    
    @Id
    @GenericGenerator(name="generator", strategy="increment")
    @GeneratedValue(generator="generator")
    private Long id;
    
    @Column(name="line_number")
    private Integer lineNumber;
    
    @Column(name="woz_objectnummer")
    private Long wozObjectNummer;
    
    @Column(name="woonplaats")
    private String woonplaatsNaam;
    
    @Column(name="straatnaam")
    private String straatNaam;
    
    @Column(name="huisnummer")
    private Integer huisNummer;
    
    @Column(name="huisletter")
    private String huisLetter;
    
    @Column(name="huisnummer_toev")
    private String huisNummerToevoeging;
    
    @Column(name="aand_huisnummer")
    private String aanduidingBijHuisnummer;
    
    @Column(name="postcode")
    private String postcode;
    
    @Column(name="lokatieomschrijving")
    private String lokatieOmschrijving;
    
    private String mutatiecode;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="ingangsdatum")
    private Date ingangsDatum;
    
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    @Column(name="einddatum")
    private Date eindDatum;
    
    @Column(name="straatcode")
    private Integer straatcode;

    public StufTAXRecord1035() {
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

    public String getWoonplaatsNaam() {
        return woonplaatsNaam;
    }

    public void setWoonplaatsNaam(String woonplaatsNaam) {
        this.woonplaatsNaam = woonplaatsNaam;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public Integer getHuisNummer() {
        return huisNummer;
    }

    public void setHuisNummer(Integer huisNummer) {
        this.huisNummer = huisNummer;
    }

    public String getHuisLetter() {
        return huisLetter;
    }

    public void setHuisLetter(String huisLetter) {
        this.huisLetter = huisLetter;
    }

    public String getHuisNummerToevoeging() {
        return huisNummerToevoeging;
    }

    public void setHuisNummerToevoeging(String huisNummerToevoeging) {
        this.huisNummerToevoeging = huisNummerToevoeging;
    }

    public String getAanduidingBijHuisnummer() {
        return aanduidingBijHuisnummer;
    }

    public void setAanduidingBijHuisnummer(String aanduidingBijHuisnummer) {
        this.aanduidingBijHuisnummer = aanduidingBijHuisnummer;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLokatieOmschrijving() {
        return lokatieOmschrijving;
    }

    public void setLokatieOmschrijving(String lokatieOmschrijving) {
        this.lokatieOmschrijving = lokatieOmschrijving;
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

    public Integer getStraatcode() {
        return straatcode;
    }

    public void setStraatcode(Integer straatcode) {
        this.straatcode = straatcode;
    }

    @Override
    public void fillValues(LineNumberReader lineNumberReader, String line) {
        this.lineNumber = lineNumberReader.getLineNumber();
        
        this.wozObjectNummer = getLong(3, 12, line);
        this.woonplaatsNaam = getString(15, 40, line);        
        this.straatNaam = getString(55, 24, line); 
        this.huisNummer = getNumber(79, 5, line); 
        this.huisLetter = getString(84, 1, line);        
        this.huisNummerToevoeging = getString(85, 4, line);
        this.aanduidingBijHuisnummer = getString(89, 2, line);
        this.postcode = getString(91, 6, line);
        this.lokatieOmschrijving = getString(97, 40, line);
        this.mutatiecode = getString(137, 1, line);
        this.ingangsDatum = getDate(138, 8, line);
        this.eindDatum = getDate(146, 8, line);
        this.straatcode = getNumber(154, 5, line); 
    }
}